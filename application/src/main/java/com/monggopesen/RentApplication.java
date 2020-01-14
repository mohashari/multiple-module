package com.monggopesen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication(scanBasePackages ={"com.monggopesen","com.monggopesen.controller"})
@EntityScan(basePackages = "com.monggopesen.domain")
@EnableCassandraRepositories(basePackages = "com.monggopesen.repository")
public class RentApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentApplication.class, args);
    }

}
