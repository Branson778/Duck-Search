package org.jointheleague.level7.duck.presentation;


import org.jointheleague.level7.duck.service.WeaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

public class WeaControllerTest {

    private WeaController wc;
    @Mock
    private WeaService ws;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        wc = new WeaController(ws);
    } /*

    @Test
    void givenGoodQuery_whenGetResults_thenReturnListOfResults() {
        //given
        String query = "Java";
        String $date = "2020-01-01";
        Result result = new Result();
        result.setCountry("COUNTRY");
        result.setLat(0);
        result.setLocaltime("LOCALTIME");
        result.setLon(0);
        result.setMoonrise("MOONRISE");
        result.setLocaltime_epoch(0);
        result.setMoon_illumination("MOONILLUMINATION");
        result.setMoon_phase("MOONPHASE");
        result.setMoonset("MOONSET");
        result.setTz_id("TZID");
        result.setName("NAME");
        result.setRegion("REGION");
        result.setSunrise("SUNRISE");
        result.setSunset("SUNSET");
        List<Result> expectedResults = Collections.singletonList(result);

        when(ws.getResults(query))
                .thenReturn(expectedResults);

        //when
        List<Result> actualResults = wc.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }
    @Test
    void givenBadQuery_whenGetResults_thenThrowsException() {
        //given
        String query = "Java";
        String $date = "2020-01-01";
        //when
        //then
        Throwable exceptionThrown = assertThrows(ResponseStatusException.class, () -> wc.getResults(query));
        assertEquals(exceptionThrown.getMessage(), "404 NOT_FOUND \"Result(s) not found.\"");
    } */
}
