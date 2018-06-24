package com.xbird.cloud.sleuth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SleuthServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(SleuthServerApplication.class, args);
  }
}
