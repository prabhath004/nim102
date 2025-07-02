package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @PostMapping("/api/login")
    public ResponseEntity<Object> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        // Placeholder logic for credential validation
        if ("user@example.com".equals(email) && "password123".equals(password)) {
           // Create a JWT token or session ID (simulated here as a simple string)
           String fakeToken = "jwt-token-or-session-id";
           Map<String, String> response = new HashMap<>();
           response.put("token", fakeToken);
           return ResponseEntity.ok(response);
        } else {
           Map<String, String> errorResponse = new HashMap<>();
           errorResponse.put("error", "Invalid credentials");
           return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(errorResponse);
        }
    }
}
