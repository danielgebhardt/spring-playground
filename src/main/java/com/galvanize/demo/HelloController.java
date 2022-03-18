package com.galvanize.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld() {
        return "<h3>Hello from Spring!</h3><br /><hr /><h4>HTML works!</h4>";
    }

}