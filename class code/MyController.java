package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName",
            defaultValue = "World") String name) {
        return String.format("<h1 style=\"color:red\">Hello %s!</h1>", name);
    }

    @GetMapping("/add")
    public String add(@RequestParam(value = "a", defaultValue = "0") Integer a,
                      @RequestParam(value = "b", defaultValue = "0") Integer b) {
        return String.format("%d +%d = %d" ,a , b, a + b);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(value = "a", defaultValue = "0") Integer a,
                      @RequestParam(value = "b", defaultValue = "0") Integer b) {
        return String.format("%d * %d = %d" ,a , b, a * b);
    }

    @GetMapping("/div")
    public String div(@RequestParam(value = "a", defaultValue = "0") Integer a,
                           @RequestParam(value = "b", defaultValue = "0") Integer b) {
        return String.format("%d / %d = %d" ,a , b, a / b);
    }
}
