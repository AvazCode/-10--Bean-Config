package com.constructor_injection.beanconfig.config;

import com.constructor_injection.beanconfig.common.Coach;
import com.constructor_injection.beanconfig.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Project name: BeanConfig
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 11:50 PM
 **/
@Configuration
public class SwimCoachConfig {

    @Bean
    public Coach theSwim() {
        return new SwimCoach();
    }

}
