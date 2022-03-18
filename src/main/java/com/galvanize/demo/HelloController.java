package com.galvanize.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class HelloController {

    @GetMapping("/" )
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/a")
    public String helloWorld2() {
        return "Hello World Again!";
    }
    @GetMapping("/cats")

}
