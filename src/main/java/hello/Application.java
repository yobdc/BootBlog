package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by lex on 2016/3/15.
 */
@SpringBootApplication
@ComponentScan("hello") // 不写@ComponentScan，默认为此文件所在包
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
