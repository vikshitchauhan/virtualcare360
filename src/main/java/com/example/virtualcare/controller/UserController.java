package com.example.virtualcare.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password,
                            Model model) {
        User user = userRepository.findByEmail(email);

        // ✅ Correct way to log email
        if (user != null) {
            System.out.println("User found: " + user.getEmail());
        } else {
            System.out.println("User  found with email: " + email);
        }

        if (user != null && user.getPassword().equals(password)) {
            model.addAttribute("message", "Login successful!");
            return "welcome"; // Create welcome.html
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "login"; // Return to login.html with error
        }
    }
}
