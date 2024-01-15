package org.jointheleague.level7.duck.service;

import org.jointheleague.level7.duck.repository.WeaRepository;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class WeaServiceTest {

    private WeaService ws;

    @Mock
    private WeaRepository wr;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        ws = new WeaService(wr);
    }
    @Test
    void whenGetResults_thenReturnListOfResults() {
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

        when(wr.getResults(query))
                .thenReturn(expectedResults);

        //when
        List<Result> actualResults = ws.getResults(query);

        //then
        assertEquals(expectedResults, actualResults);
    }
}
