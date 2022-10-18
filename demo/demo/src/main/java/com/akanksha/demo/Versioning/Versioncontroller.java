package com.akanksha.demo.Versioning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Versioncontroller {
    
    @GetMapping("/Person1")
    public Person1 version1()
    {
        return new Person1("Akanksha Singhal");
    }

    @GetMapping("/Person2")
    public Person2 version2()
    {
        return new Person2("Raksha","Singhal");
    }

    @GetMapping(value="/Person/param", params="version=1")
    public Person1 Param1()
    {
        return new Person1("Raksha Singhal");  //localhost:8080/Person/param?version=1
    }

    @GetMapping(value="/    Person/param", params="version=2")
    public Person2 Param2()
    {
        return new Person2("Raksha","Singhal"); //localhost:8080/Person/param?version=1
    }

    
}
