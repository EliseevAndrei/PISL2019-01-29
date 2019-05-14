package by.it.group673602.eliseev.lab6_7spring.src.main.java.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
}
