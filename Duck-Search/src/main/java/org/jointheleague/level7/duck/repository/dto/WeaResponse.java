package org.jointheleague.level7.duck.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeaResponse {

    private List<Results> results;

    @JsonProperty("results")
    public List<Results> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Results> results) {
        this.results = results;
    }


}
