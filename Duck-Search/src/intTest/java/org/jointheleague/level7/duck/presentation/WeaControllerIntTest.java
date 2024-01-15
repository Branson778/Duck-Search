package org.jointheleague.level7.duck.presentation;
import org.jointheleague.level7.duck.repository.dto.WeaResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.jointheleague.level7.duck.repository.dto.Result;
import org.jointheleague.level7.duck.service.WeaService;
import org.springframework.web.util.UriBuilder;

@WebMvcTest(WeaController.class)
public class WeaControllerIntTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private WeaService weaService;

    @Test
    void whenGetResults_thenReturnListOfResults() {
        //given
        WeaResponse wr2 = new WeaResponse();
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

        when(weaService.getResults(query))
                .thenReturn(expectedResults);


        //when


        //then
        MvcResult mvcResult = mockMvc.perform(get("/searchLocResults?q="+query))
                        .andDo(print())
                                .andExpect(status().isOk())
                                        .andExpect(jsonPath("$[0].title", is()))
        assertEquals(expectedResults, actualWeaResults);
    }
}
