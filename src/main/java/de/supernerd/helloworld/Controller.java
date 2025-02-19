package de.supernerd.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class Controller {

    @GetMapping("/hello/{firstname}")
    public String hello(@PathVariable String firstname) {
        System.out.println("Hello World!");
        return "Hello " + firstname + "!";
    }
}
