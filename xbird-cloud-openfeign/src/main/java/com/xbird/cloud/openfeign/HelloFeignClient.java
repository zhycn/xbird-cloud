package com.xbird.cloud.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "XBIRD-CLOUD-NETFLIX-EUREKA-CLIENT")
public interface HelloFeignClient {

  @GetMapping("/")
  String sayHello(@RequestParam(value = "name") String name);
  
}
