package minek.ckan.v3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import minek.ckan.gson.LocalDateTimeJsonDeserializer;
import minek.ckan.gson.MemberJsonDeserializer;
import minek.ckan.retrofit.AuthorizationInterceptor;
import minek.ckan.retrofit.ConverterFactory;
import minek.ckan.retrofit.ResponseBodyInterceptor;
import minek.ckan.v3.service.ActionGetService;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.time.LocalDateTime;

public class BaseTest {

    public ActionGetService action() {
        return retrofit.create(ActionGetService.class);
    }

    private Retrofit retrofit;

    public BaseTest() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(LocalDateTime.class, new LocalDateTimeJsonDeserializer())
                .registerTypeAdapter(Member.class, new MemberJsonDeserializer())
                .create();

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);
        httpClient.addInterceptor(new AuthorizationInterceptor("71e8708e-9cf5-4a4d-ac9e-769cee359995"));
        httpClient.addInterceptor(new ResponseBodyInterceptor());

        retrofit = new Retrofit.Builder()
                .baseUrl("https://demo.ckan.org/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addConverterFactory(new ConverterFactory())
                .client(httpClient.build())
                .build();
    }

}
