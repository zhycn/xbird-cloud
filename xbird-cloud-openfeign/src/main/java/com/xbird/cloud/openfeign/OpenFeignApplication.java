package com.xbird.cloud.openfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RestController
public class OpenFeignApplication {

  public static void main(String[] args) {
    SpringApplication.run(OpenFeignApplication.class, args);
  }

  @Autowired
  private HelloFeignClient helloFeignClient;

  @GetMapping(value = "/")
  public String sayHi(@RequestParam(defaultValue = "Feign") String name) {
    return helloFeignClient.sayHello(name);
  }
}
