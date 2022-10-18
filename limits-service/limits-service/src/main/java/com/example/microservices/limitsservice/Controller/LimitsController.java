package com.example.microservices.limitsservice.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
    @Autowired
    private Configurationfile confi;

    @GetMapping("/Limits")
    public Limits retrieveLimits()
    {
        //return new Limits(1,1000);
        return new Limits(confi.getMaximum(),confi.getMinimum());
    }
}
