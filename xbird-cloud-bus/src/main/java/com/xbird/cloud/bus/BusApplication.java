package com.xbird.cloud.bus;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class BusApplication {

  public static void main(String[] args) {
    SpringApplication.run(BusApplication.class, args);
  }
}
