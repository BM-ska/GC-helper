package com.gchelper.controller;
import org.springframework.web.bind.annotation.*;

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
