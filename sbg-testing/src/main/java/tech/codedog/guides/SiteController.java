package tech.codedog.guides;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author https://github.com/gukt
 * @version 1.0
 * @date 2020/7/16 00:21
 */
@Controller
public class SiteController {

    @RequestMapping("/")
    @ResponseBody
    public Object home() {
        return "Hello, World";
    }
}
