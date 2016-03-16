package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lex on 2016/3/15.
 */
@SpringBootApplication
@ComponentScan("hello") // 不写@ComponentScan，默认为此文件所在包
public class Application {
    private static Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("hello {}", "Application");
        SpringApplication.run(Application.class, args);
    }
}
