package com.yourname.pushhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PushApp {
    public static void main(String[] args) {
        SpringApplication.run(PushApp.class, args);
        System.out.println("🚀 Push Server Started on port 8080!");
    }
}
