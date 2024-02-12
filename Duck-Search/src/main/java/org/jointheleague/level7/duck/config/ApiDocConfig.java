package org.jointheleague.level7.duck.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocConfig {
    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Duck Search - Weather API Astronomy Search").description("This application searches for the current date's astronomy data for a specified location.").version("0.6"));
    }
}