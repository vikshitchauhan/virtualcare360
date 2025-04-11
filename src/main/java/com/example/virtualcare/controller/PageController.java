package com.example.virtualcare.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

  @GetMapping("/")
    public static String index(){
        return "redirect:/home";
        }


         @RequestMapping("/home")
    public String home(Model model){
        System.out.println("Home page handler");
        model.addAttribute("name","vikshit");
        model.addAttribute("githubrepository","https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/solutions/1251853/simple-java-solution-backtracking/");
        return "home";
    }

}
