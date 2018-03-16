package com.company.helloworld;


import com.company.helloworld.model.HelloWorldGreetingService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldGreetingServiceTest {

    private HelloWorldGreetingService helloWorldGreetingService;
    @Before
    public void setUp() {
        helloWorldGreetingService = new HelloWorldGreetingService();
    }

    @Test
    public void testGreet() {
        String greeting = helloWorldGreetingService.greet("Cr7");
        assertEquals("Hello, Cr7! Welcome to 'HelloWorld' plug-in",greeting);
    }
}
