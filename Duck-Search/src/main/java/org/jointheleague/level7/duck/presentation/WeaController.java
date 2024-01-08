package org.jointheleague.level7.duck.presentation;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.jointheleague.level7.duck.service.WeaService;
import org.springframework.http.HttpStatus;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@RestController
public class WeaController {

    private final WeaService weaService;
    public WeaController (WeaService weaService){
        this.weaService = weaService;
    }
    @GetMapping("/searchWeaResults")
    @ApiOperation(value = "Searches for astronomical data matching the searched location and date.",
            notes = "The date of the search cannot be before the 1st of January, 2015 and must be in yyyy-MM-dd format. The location must be latitude and longitude to the decimal degree, a city name, US zip code, UK postcode, Canada postal code, metar code, iata/digit airport code, or ip adress.",
            response = Result.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found"),
            @ApiResponse(code = 404, message = "Result(s) not found")
    })
    public List<Result> getResults(@RequestParam(value="q") String query, @RequestParam(value="dt") String $date){
        List<Result> results = weaService.getResults(query, $date);
        if(CollectionUtils.isEmpty(results)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result(s) not found.");
        }
        return results;

    }
}
