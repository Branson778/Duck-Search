package org.jointheleague.level7.duck.repository;

import org.jointheleague.level7.duck.DuckSearchApplication;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.jointheleague.level7.duck.repository.dto.WeaResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Repository
public class WeaRepository {
    private final WebClient webClient;

    public static final String baseUrl = "http://api.weatherapi.com/v1/astronomy.json";

    public WeaRepository(){
        webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    //public String getResults(String query, String $date){
    //    return "Searching for astronomical data related to the location " + query + " on the date "+ $date +".";
    //}

    public List<Result> getResults(String query, String $date) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        //.queryParam("fo", "json")
                        //.queryParam("at", "results")
                        .queryParam("q", query)
                        .queryParam("dt", $date)
                        .queryParam("k", DuckSearchApplication.apiToken)
                        .build()
                )
                .retrieve()
                .bodyToMono(WeaResponse.class)
                .block()
                .getResults();
    }
}
