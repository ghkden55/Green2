package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/result")
    public String result(@RequestParam("userName") String userName2, @RequestParam("userAge") String userAge2, Model model) {

        model.addAttribute("gender", "female");
        System.out.println(userName2);
        System.out.println(userAge2);
        return "result";
    }
}
