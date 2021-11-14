package Springinaction.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Elshad Jabbarov
 * 14.11.2021
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
