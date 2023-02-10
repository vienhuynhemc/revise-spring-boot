package com.leap.revise.controllers.implement;

import com.leap.revise.controllers.GreetingController;
import com.leap.revise.models.Greeting;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingControllerImplement implements GreetingController {

    @Override
    public Greeting hello(String name) {
        return Greeting.builder()
                .id(1)
                .content("Hello, " + (name.length() != 0 ? name : "World") + "!")
                .build();
    }

}
