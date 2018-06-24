package com.xbird.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
public class BusApplication {

  public static void main(String[] args) {
    SpringApplication.run(BusApplication.class, args);
  }
}
