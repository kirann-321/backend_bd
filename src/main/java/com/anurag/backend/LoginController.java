
package com.anurag.backend;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {

    @PostMapping("/login")
    public Map<String, Object> login(
            @RequestBody Map<String, String> login) {

        String username = login.get("username");
        String password = login.get("password");

        if ("admin".equals(username)
                && "admin123".equals(password)) {

            return Map.of("success", true);
        }

        return Map.of("success", false);
    }
}