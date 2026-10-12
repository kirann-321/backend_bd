
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
@RequestMapping("/api/donors")
@CrossOrigin(origins = "http://localhost:5173")
public class DonorController {

    private final List<Map<String, String>> donors =
            new ArrayList<>();

    @GetMapping
    public List<Map<String, String>> getDonors() {
        return donors;
    }

    @PostMapping
    public Map<String, String> addDonor(
            @RequestBody Map<String, String> donor) {
        donors.add(new HashMap<>(donor));
        return Map.of("message", "Donor registered successfully");
    }
}