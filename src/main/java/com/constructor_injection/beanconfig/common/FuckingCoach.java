package com.constructor_injection.beanconfig.common;

import org.springframework.context.annotation.Primary;

/**
 * Project name: BeanConfig
 * Author: AvaZ
 * Data: 6/23/2024
 * Time: 12:24 AM
 **/
public class FuckingCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "The fucking coach workout. ❤️";
    }
}
