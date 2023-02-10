package com.leap.revise.controllers;

import com.leap.revise.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(path = "greeting")
public interface GreetingController {

    @GetMapping
    Greeting hello(@RequestParam(defaultValue = "") String name);

}
