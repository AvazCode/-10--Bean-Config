package com.constructor_injection.beanconfig.rest;

import com.constructor_injection.beanconfig.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name: BeanConfig
 * Author: AvaZ
 * Data: 6/22/2024
 * Time: 11:39 PM
 **/
@RestController
public class Controller {
    private final Coach swimcoach;
    private final Coach fuckingcoach;


    @Autowired
    public Controller(@Qualifier("theFucking") Coach theFuckingCoach,
                      @Qualifier("theSwim") Coach theSwimCoach ) {
        swimcoach = theSwimCoach;
        fuckingcoach = theFuckingCoach;
    }

    @GetMapping("/getCoach")
    public String getSwimcoach(){
        return swimcoach.getDailyWorkout() + " |||| \n"
                + fuckingcoach.getDailyWorkout();
    }
}
