package com.example.consulconsumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "consul-provider")
public interface ConsulClientFeign {
    @GetMapping("/hi")
    String sayHiFromClientConsul(@RequestParam String name);
}
