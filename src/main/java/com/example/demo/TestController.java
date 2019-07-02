package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author <a href="mailto:davidm@yambay.com">David MacDonald</a>
 */

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Hello world - Heroku";
    }
}
