package minek.ckan.v3.basic.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rating {
    @JsonProperty("rating average")
    private double average;
    @JsonProperty("rating count")
    private int count;
}
