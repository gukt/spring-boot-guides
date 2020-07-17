package tech.codedog.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author https://github.com/gukt
 * @version 1.0
 * @date 2020/7/15 03:21
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String home () {
        return "Hello Spring boot!";
    }
}
