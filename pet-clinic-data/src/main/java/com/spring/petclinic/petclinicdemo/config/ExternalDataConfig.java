package com.spring.petclinic.petclinicdemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:ExternalData.properties")
public class ExternalDataConfig {
    @Value("${first.name}")
    String firstName;
    @Value("${last.name}")
    String LastName;

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertyConfigurator(){
        return new PropertySourcesPlaceholderConfigurer();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return LastName;
    }
}
