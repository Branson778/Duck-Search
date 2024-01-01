package org.jointheleague.level7.duck.presentation;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.jointheleague.level7.duck.service.WeaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
            response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Result(s) found")
    })
    public String getResults(@RequestParam(value="q") String query, @RequestParam(value="dt") String $date){
        return "Searching the astronomy data related to the area of " + query + " on "+ $date+ ".";
    }
}
