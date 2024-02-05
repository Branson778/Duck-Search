package org.jointheleague.level7.duck.repository;

import org.jointheleague.level7.duck.DuckSearchApplication;

import org.jointheleague.level7.duck.repository.dto.Results;
import org.jointheleague.level7.duck.repository.dto.WeaResponse;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;

import java.net.URI;
import java.util.List;

@Repository
public class WeaRepository {
    private final WebClient webClient;




    public static final String baseUrl = "https://api.weatherapi.com/v1/astronomy.json";
    //public static final String baseUrl = "https://api.weatherapi.com/v1/astronomy.json?key="+DuckSearchApplication.apiToken+"&";

    public WeaRepository(WebClient webClientMock){this.webClient = webClientMock;}
    public WeaRepository(){
        webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    //public String getResults(String query, String $date){
    //    return "Searching for astronomical data related to the location " + query + " on the date "+ $date +".";
    //}

    public List<Results> getResults(String query) {
       // String blockString = webClient.get()
       //         .uri(uriBuilder -> uriBuilder.build())
        //        .retrieve()
         //       .bodyToMono(String.class)
          //      .block();
        //URI uri = webClient.get().uri(uriBuilder -> uriBuilder.queryParam("key", DuckSearchApplication.apiToken).queryParam("q", query).build());
        System.out.println(query);
        //return null;
        return webClient.get()
                .uri(uriBuilder -> { //System.out.println(uriBuilder.queryParam("key", DuckSearchApplication.apiToken)
                                //.queryParam("q", query).build().toASCIIString());
                    return uriBuilder
                        //.queryParam("fo", "json")
                        //.queryParam("at", "results")
                        .queryParam("key", DuckSearchApplication.apiToken)
                        .queryParam("q", query)
                        //.queryParam("dt", $date)
                        .build();
                }
                )
                .retrieve()
                .bodyToMono(WeaResponse.class)
                .block()
                .getResults();

    }

}
