package com.constructor_injection.beanconfig.config;

import com.constructor_injection.beanconfig.common.Coach;
import com.constructor_injection.beanconfig.common.FuckingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * Project name: BeanConfig
 * Author: AvaZ
 * Data: 6/23/2024
 * Time: 12:26 AM
 **/
@Configuration
public class FuckingCoachConfig {

    @Bean
    public Coach theFucking() {
        return new FuckingCoach();
    }
}
