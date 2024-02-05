package org.jointheleague.level7.duck.presentation;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.jointheleague.level7.duck.repository.dto.Results;
import org.jointheleague.level7.duck.service.WeaService;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
@RestController
public class WeaController {

    private final WeaService weaService;
    public WeaController (WeaService weaService){
        this.weaService = weaService;
    }
    @GetMapping("/searchWeaResults")
    @Operation(summary = "Searches for astronomical data matching the searched location and date.",
            description = "The date of the search cannot be before the 1st of January, 2015 and must be in yyyy-MM-dd format. The location must be latitude and longitude to the decimal degree, a city name, US zip code, UK postcode, Canada postal code, metar code, iata/digit airport code, or ip adress.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Result(s) found", content = {@Content(mediaType="application/json",schema=@Schema(implementation=Results.class))}),
            @ApiResponse(responseCode = "400", description = "Result(s) not found, an error occurred with the parameter or url"),
            @ApiResponse(responseCode = "401", description = "Result(s) not found, an error occurred with the api key"),
            @ApiResponse(responseCode = "403", description = "Result(s) not found, a large error occurred with the api key"),
            @ApiResponse(responseCode = "404", description = "Result(s) not found")
//, content = {@Content(mediaType="application/json",schema=@Schema(implementation=Result.class))}
    })
    public List<Results> getResults(@RequestParam(value="q") String query){
        List<Results> results = weaService.getResults(query);
        if(results==null || results.size()==0){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        //return results;
        return weaService.getResults(query);

    }
}
