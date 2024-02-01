package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

   @RequestMapping("/")
    public @ResponseBody String root() {
       return "hello";
   }


   @GetMapping("/main")
    public String mainPage() {
       System.out.println("main");
       return "main";
   }


    @PostMapping("/proc1")
    public String proc(@RequestParam String id, @RequestParam String pw, Model model) {

        model.addAttribute("id", id);
        model.addAttribute("pw", pw);

        return "result1";
    }
}
