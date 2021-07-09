package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/")
    public String login() {
        return "login";
    }

    @RequestMapping("/game")
    public String game() {
        return "index";
    }
}
