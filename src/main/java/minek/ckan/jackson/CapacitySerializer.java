package minek.ckan.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import minek.ckan.v3.basic.model.enums.Capacity;

import java.io.IOException;

public class CapacitySerializer extends JsonSerializer<Capacity> {

    @Override
    public void serialize(Capacity value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeString(value.getCode());
    }
}
