package com.srikanth.kafka;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(KafkaTemplate<String, String> template) {
        return args -> {
            template.send("simple", "First Message");
        };
    }
}
