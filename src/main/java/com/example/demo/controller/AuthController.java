package com.example.demo.controller;

import com.example.demo.util.JwtUtil;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("")
public class AuthController {
    private final JwtUtil jwtUtil = new JwtUtil();

    @PostMapping("/auth/login")
    public String login(@RequestParam String username, @RequestParam String
            password) {
// Validez l'utilisateur (remplacer par un véritable système d'authentification)
        if ("user".equals(username) && "password".equals(password)) {
            //return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Invalid credentials");
    }

    @GetMapping("/auth/test")
    public String test() {
        return "test";
    }
}