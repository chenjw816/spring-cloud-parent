package cjw.springboot.sample.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("thymeleaf")
public class HelloController {

    @RequestMapping("")
    public String hello(ModelMap map) {
        map.addAttribute("host", "www.baidu.com");
        return "index";
    }
}
