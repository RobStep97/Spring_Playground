package com.galvanize.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/math")
public class HelloController {

    @GetMapping("/" )
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/pi")
    public String helloWorld2() {
        return "3.141592653589793";
    }


}
