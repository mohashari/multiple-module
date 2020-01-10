package com.monggopesen.trycassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication()
@ComponentScan(basePackages = "com.monggopesen.*")
public class RentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentApplication.class, args);
    }

}
