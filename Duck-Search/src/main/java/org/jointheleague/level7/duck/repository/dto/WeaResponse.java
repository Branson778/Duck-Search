package org.jointheleague.level7.duck.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeaResponse {

    private List<Result> results = null;

    @JsonProperty("results")
    public List<Result> getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(List<Result> results) {
        this.results = results;
    }


}
