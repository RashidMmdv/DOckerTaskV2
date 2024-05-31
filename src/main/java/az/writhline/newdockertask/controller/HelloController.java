package az.writhline.newdockertask.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HelloController {
    @GetMapping("/hello1")
    public String  Hello(){
        return "Hello lesson 1";
    }
}
