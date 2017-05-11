package org.shengnian.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheng on 2017/5/11.
 */
@SpringBootApplication
@RestController
public class DockerApplication {

    @RequestMapping("/")
    public String home () {
        return "Hello Docker world!";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}
