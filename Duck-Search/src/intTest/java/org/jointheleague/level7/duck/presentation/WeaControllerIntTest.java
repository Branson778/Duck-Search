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

import org.jointheleague.level7.duck.service.WeaService;
import org.springframework.web.util.UriBuilder;

@WebMvcTest(WeaController.class)
public class WeaControllerIntTest {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private WeaService weaService;

   /* @Test
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

        MvcResult mvcResult;
        try {
            mvcResult = mockMvc.perform(get("/searchWeaResults?q=" + query))
                    .andDo(print())
                    .andExpect(status().isOk())
                    .andExpect(jsonPath("$[0].country", is("COUNTRY")))
                    .andExpect(jsonPath("$[0].lat", is(0)))
                    .andExpect(jsonPath("$[0].localtime", is("LOCALTIME")))
                    .andExpect(jsonPath("$[0].moonrise", is("MOONRISE")))
                    .andExpect(jsonPath("$[0].localtime_epoch", is(0)))
                    .andExpect(jsonPath("$[0].moon_illumination", is("MOONILLUMINATION")))
                    .andExpect(jsonPath("$[0].moon_phase", is("MOONPHASE")))
                    .andExpect(jsonPath("$[0].moonset", is("MOONSET")))
                    .andExpect(jsonPath("$[0].tz_id", is("TZID")))
                    .andExpect(jsonPath("$[0].name", is("NAME")))
                    .andExpect(jsonPath("$[0].region", is("REGION")))
                    .andExpect(jsonPath("$[0].sunrise", is("SUNRISE")))
                    .andExpect(jsonPath("$[0].sunset", is("SUNSET")))
                    .andReturn();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        assertEquals(MediaType.APPLICATION_JSON_VALUE, mvcResult.getResponse().getContentType());
    } */
    @Test
    public void givenBadQuery_whenSearchForResults_thenIsNotFound() throws Exception {
        //given
        String query = "Java";

        //when
        //then
        mockMvc.perform(get("/searchLocResults?q=" + query))
                .andDo(print())
                .andExpect(status().isNotFound());
    }
}
