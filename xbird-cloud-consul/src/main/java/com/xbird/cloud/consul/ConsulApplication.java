package com.xbird.cloud.consul;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringCloudApplication
@RestController
public class ConsulApplication {

  public static void main(String[] args) {
    SpringApplication.run(ConsulApplication.class, args);
  }
  
  @GetMapping("/")
  public String home(@RequestParam(defaultValue = "World") String name) {
    return "Hello " + name;
  }

}
