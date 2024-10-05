package com.example.BasicSpringBootProjectUsingDI;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    public DB getProdDb() {
        return new Prod();
    }

    @Bean
    @Primary
    public DB getDevDb() {
        return new Dev();
    }

    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }

}
