package com.gchelper.configuration;

import com.gchelper.services.ValidatorService;
import com.gchelper.services.ValidatorServiceImplementation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Barbara Moczulska
 */

@Configuration
public class ValidatorConfiguration {

    @Bean
    public ValidatorService validatorService()
    {
        return new ValidatorServiceImplementation();
    }

}