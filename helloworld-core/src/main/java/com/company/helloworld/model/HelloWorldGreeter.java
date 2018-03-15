package com.company.helloworld.model;


import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldGreeter {

    @Autowired
    private HelloWorldGreetingService service;


    public HelloWorldGreeter() {
    }

    public String greet(String name) {
        return service.greet(name);
    }
}
