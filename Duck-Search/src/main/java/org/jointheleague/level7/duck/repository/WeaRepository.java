package org.jointheleague.level7.duck.repository;

import org.jointheleague.level7.duck.DuckSearchApplication;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;

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

    public String getResults(String query, String $date) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("fo", "json")
                        .queryParam("at", "results")
                        .queryParam("q", query)
                        .queryParam("dt", $date)
                        .queryParam("k", DuckSearchApplication.apiToken)
                        .build()
                )
                .retrieve()
                .bodyToMono(String.class)
                .block();
    }
}
