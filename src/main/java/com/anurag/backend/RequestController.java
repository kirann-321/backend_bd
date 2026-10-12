
package com.anurag.backend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/requests")
@CrossOrigin(origins = "http://localhost:5173")
public class RequestController {

    private final List<Map<String, Object>> requests =
            new ArrayList<>();

    @GetMapping
    public List<Map<String, Object>> getRequests() {
        return requests;
    }

    @PostMapping
    public Map<String, String> addRequest(
            @RequestBody Map<String, Object> request) {
        requests.add(new HashMap<>(request));
        return Map.of("message", "Request added successfully");
    }
}
