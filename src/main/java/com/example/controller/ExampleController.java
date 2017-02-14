package com.example.controller;

import com.example.entity.User;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * Created by lpe234 on 2017/2/14.
 */


@RestController
@EnableAutoConfiguration
public class ExampleController {

    @RequestMapping("/")
    String say() {
        return "Hello world.";
    }

    @RequestMapping("/now")
    String now() {
        return "现在时间：" + (new Date()).toString();
    }

    @RequestMapping("/user")
    User user() {
        User user = new User();
        user.setName("apple");
        user.setAge(23);
        return user;
    }

}

@Controller
@EnableAutoConfiguration
class IndexController {

    @RequestMapping("/index")
    String index(ModelMap map) {
        map.addAttribute("title", "thymeleaf模板");
        return "index";
    }
}
