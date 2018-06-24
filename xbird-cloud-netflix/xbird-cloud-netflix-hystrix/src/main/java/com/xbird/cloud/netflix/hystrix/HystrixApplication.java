package com.xbird.cloud.netflix.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringCloudApplication
@EnableHystrixDashboard
public class HystrixApplication {

  public static void main(String[] args) {
    SpringApplication.run(HystrixApplication.class, args);
  }
}
