package com.info.cop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class InfoCommonClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(InfoCommonClientApplication.class, args);
    }

}
