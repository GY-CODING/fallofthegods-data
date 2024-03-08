package com.gycoding.fallofthegods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRouting {
    @GetMapping("/")
    public String home() {
        return "<h1 style=\"color: purple\">Developed by GY Coding.</h1>";
    }
}
