package com.example.consulconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiService {
    @Autowired
    private ConsulClientFeign consulClientFeign;

    public String sayHi(String name){
        return consulClientFeign.sayHiFromClientConsul(name);
    }
}
