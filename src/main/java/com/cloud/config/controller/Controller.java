package com.cloud.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/config")
    public String getMessage() {
        return "This is a message from Config Server";
    }
}
