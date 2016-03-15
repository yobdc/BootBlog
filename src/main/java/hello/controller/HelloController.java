package hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lex on 2016/3/15.
 */
@RestController
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> hello() {
        logger.debug("hello {}", "world");
        Map<String, String> map = new HashMap<String, String>();
        map.put("hello", "Greeting from Spring Boot");
        return map;
    }
}
