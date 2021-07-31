package com.gchelper.gchelper;

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



}
