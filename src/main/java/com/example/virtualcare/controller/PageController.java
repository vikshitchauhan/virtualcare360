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
  
  @RequestMapping("/about")
public static String aboutpage(){
    System.out.println("about page loading");
    return "about";
}
@RequestMapping("/service")
public static String servicepage(){
    System.out.println("service page loading");
    return "service";
}
//contact page

@GetMapping("/contact")
public static String contactpage(){
    System.out.println("contact page loading");
    return "contact";
}
@GetMapping("/doctors")
public static String doctorspage(){
    System.out.println("doctor page loading");
    return "Doctors";
}
@GetMapping("/fitness")
public static String fitnesspage(){
    System.out.println("fitness page loading");
    return "fitness";
}
@GetMapping("/login")
public static String login(){
    System.out.println("fitness page loading");
    return "login";
}


}
