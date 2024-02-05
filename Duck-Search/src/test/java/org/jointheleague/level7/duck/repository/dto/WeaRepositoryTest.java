package org.jointheleague.level7.duck.repository.dto;

import org.jointheleague.level7.duck.repository.WeaRepository;
import com.fasterxml.jackson.annotation.JsonAlias;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class WeaRepositoryTest {

    private WeaRepository wr;
    @Mock
    WebClient webClientMock;
    @Mock
    WebClient.RequestHeadersUriSpec requestHeadersUriSpecMock;
    @Mock
    WebClient.RequestHeadersSpec requestHeadersSpecMock;
    @Mock
    WebClient.ResponseSpec responseSpecMock;
    @Mock
    Mono<WeaResponse> WeaResponseMonoMock;

    @BeforeEach
    void setUp(){
        MockitoAnnotations.openMocks(this);
        wr = new WeaRepository(webClientMock);
    }
  /*  @Test
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

        when(webClientMock.get())
                .thenReturn(requestHeadersUriSpecMock);
        when(requestHeadersUriSpecMock.uri((Function<UriBuilder, URI>) any()))
                .thenReturn(requestHeadersSpecMock);
        when(requestHeadersSpecMock.retrieve())
                .thenReturn(responseSpecMock);
        when(responseSpecMock.bodyToMono(WeaResponse.class))
                .thenReturn(WeaResponseMonoMock);
        when(WeaResponseMonoMock.block())
                .thenReturn(wr2);

        //when
        List<Result> actualWeaResults = wr.getResults(query);

        //then
        assertEquals(expectedResults, actualWeaResults);
    } */
}
