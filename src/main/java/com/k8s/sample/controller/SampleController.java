package com.k8s.sample.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("docker-swarm")
public class SampleController {
    @GetMapping("test")
    public String index() {
        return "Sample Docker Swarm from Spring Boot";
    }

}
