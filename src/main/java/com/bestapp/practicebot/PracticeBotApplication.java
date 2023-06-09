package com.bestapp.practicebot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class PracticeBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeBotApplication.class, args);
    }

}
