package com.akanksha.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



//controller
@RestController
public class HelloWorldContainer {
//GET
//URI -/helloWorld
// method - "Hello World"
 
    @RequestMapping(method=RequestMethod.GET,path = "/hello-world")
    public String HelloWorld()
    {
        return "Hi People!";
    }

    @GetMapping(path = "/hello-worldbean")
    public helloworldbean gethelloworldbean()
    {
        return new helloworldbean ("Hi people from the Bean! ");
    }

    

}

