package com.gycoding.fallofthegods.controller;

import com.gycoding.fallofthegods.model.entities.ServerStatus;
import com.gycoding.fallofthegods.model.entities.exceptions.FOTGAPIException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home() throws FOTGAPIException {
        Resource resource = new ClassPathResource("static/index.html");

        try {
            return new String(Files.readAllBytes(Paths.get(resource.getURI())));
        } catch (IOException e) {
            throw new FOTGAPIException(ServerStatus.HOME_NOT_FOUND);
        }
    }

    @GetMapping("/makemeacoffee")
    public String makeCoffee() throws FOTGAPIException {
        throw new FOTGAPIException(ServerStatus.I_AM_A_TEAPOT);
    }
}
