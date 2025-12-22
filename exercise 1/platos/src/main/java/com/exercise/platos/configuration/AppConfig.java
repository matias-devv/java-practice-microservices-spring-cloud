package com.exercise.platos.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean("ingredientsApi")
    public RestTemplate instanceRestTemplate() {
        return new RestTemplate();
    }

}
