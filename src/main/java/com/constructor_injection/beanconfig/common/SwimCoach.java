package com.constructor_injection.beanconfig.common;

/**
 * Project name: BeanConfig
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 11:38 PM
 **/
public class SwimCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Hello Swim Coach";
    }
}
