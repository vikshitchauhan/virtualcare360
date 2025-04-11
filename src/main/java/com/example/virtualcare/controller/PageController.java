package com.example.virtualcare.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {



    
  @GetMapping("/home")
  public String homePage() {
      return "home"; // This renders templates/home.html
  }

}
