package org.jointheleague.level7.duck.repository.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeaResponse {

    private Results results;

    @JsonProperty("results")
    public Results getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(Results results) {
        this.results = results;
    }


}
