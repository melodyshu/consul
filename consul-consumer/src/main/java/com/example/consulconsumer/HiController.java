package com.example.consulconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiController {

    @Autowired
    private HiService hiService;

    @GetMapping("/hi2")
    public String sayHi(@RequestParam String name){
       return hiService.sayHi(name);
    }
}
