package com.example.demoamir;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoAmirApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAmirApplication.class, args);
        System.out.println(new BCryptPasswordEncoder().encode("1234"));
    }


}
