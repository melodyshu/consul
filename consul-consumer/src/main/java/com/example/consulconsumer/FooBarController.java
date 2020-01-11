package com.example.consulconsumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class FooBarController {
    @Value("${foo.bar}")
    private String fooBar;

    @GetMapping("/foo")
    public String getFooBar(){
        return this.fooBar;
    }
}
