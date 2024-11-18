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
        // Return an HTML string with a complete background color for the entire page
        return "<html>" +
                "<head>" +
                "<style>" +
                "html, body { height: 100%; margin: 0; }" + // Ensure full height for html and body
                "body { background-color: #f0f0f0; font-family: Arial, sans-serif; display: flex; justify-content: center; align-items: center; position: relative; height: 100%; }" + // Body takes full height and is centered
                // Styling for the logo to place it in the top-left corner
                ".logo { position: absolute; top: 10px; left: 10px; width: 150px; }" +
                // Styling for the message container to center it
                ".message-container { background-color: #4CAF50; color: white; padding: 20px; border-radius: 10px; text-align: center; }" +
                "</style>" +
                "</head>" +
                "<body>" +
                // Logo positioned in the top-left corner
                "<img src='/images/logo.png' alt='PlayersHealth Logo' class='logo' />" +
                // Centered message
                "<div class='message-container'>" +
                "<h1><b>Welcome to PlayersHealth..!!</b></h1>" +
                "</div>" +
                "</body>" +
                "</html>";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }
}
