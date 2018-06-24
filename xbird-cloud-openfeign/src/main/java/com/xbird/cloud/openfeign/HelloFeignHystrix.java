package com.xbird.cloud.openfeign;

import org.springframework.stereotype.Component;

@Component
public class HelloFeignHystrix implements HelloFeignClient {

  @Override
  public String sayHello(String name) {
    return "Sorry " + name;
  }

}
