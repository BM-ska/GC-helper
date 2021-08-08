package com.gchelper.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TestController
 *
 * @author Piotr Stoklosa
 */
@RestController
public class TestController {

    @RequestMapping
    public String helloWorld() {
        return "Hello";
    }

    @RequestMapping("bye")
    public String bye(){
        return "bye";
    }

    @GetMapping("cos/{id}")
    public String cos(@PathVariable String id) {return id;}

}
