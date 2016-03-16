package hello.controller;

import hello.domain.Post;
import hello.repository.PostRepository;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lex on 2016/3/15.
 */
@RestController
public class HelloController {
    private Logger logger = LogManager.getLogger(this.getClass());

    @Autowired
    private PostRepository postRepo;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public List<Post> hello() {
        logger.debug("hello {}", "world");
        return postRepo.findAll();
    }
}
