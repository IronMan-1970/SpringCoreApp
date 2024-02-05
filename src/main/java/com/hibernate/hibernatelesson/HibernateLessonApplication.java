package com.hibernate.hibernatelesson;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HibernateLessonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateLessonApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
     return runner ->{
         System.out.println("Hello World!");
     };

    }
}
