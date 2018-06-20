package com.vardhan.springboot.swaggerexample.resource;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

    @GetMapping
    public String hello(){
        return "Hello World";
    }

    @PostMapping("/post")
    public String helloPost(@RequestBody final String hello) {
        return hello;
    }

    @PostMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}
