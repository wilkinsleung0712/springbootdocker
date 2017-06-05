package com.bfd.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wilkins.Liang on 5/06/2017.
 */
@RestController
public class HomeController {
    @RequestMapping("/home")
    public String getHomePage() {
        return "Hello, Docker from Spring Boot";
    }
}
