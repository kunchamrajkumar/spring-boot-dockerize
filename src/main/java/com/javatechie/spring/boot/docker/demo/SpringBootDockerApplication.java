package com.javatechie.spring.boot.docker.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

    @GetMapping("/message")
    public String getMessage() {
        // Return an HTML string with inline styling for bold text and a colorful background
        return "<div style='background-color: #4CAF50; color: white; padding: 20px; border-radius: 10px; text-align: center;'>" +
                "<h1><b>Welcome to PlayersHealth..!!</b></h1>" +
                "</div>";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }
}
