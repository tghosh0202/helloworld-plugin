package com.company.helloworld.model;


import org.springframework.stereotype.Component;

@Component
public class HelloWorldGreetingService  {
    
    public HelloWorldGreetingService() {
        
    }
   
   public String greet(String name) {
       return "Hello, " + name +"! Welcome to 'HelloWorld' plug-in";
   }
}

