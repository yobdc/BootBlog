package hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lex on 2016/3/15.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Spring Boot!";
    }
}
