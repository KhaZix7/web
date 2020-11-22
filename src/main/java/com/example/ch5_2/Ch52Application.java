package com.example.ch5_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ch52Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Ch52Application.class, args);
    }

}
