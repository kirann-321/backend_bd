
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
@RequestMapping("/api/stock")
@CrossOrigin(origins = "http://localhost:5173")
public class StockController {

    private final List<Map<String, Object>> stock =
            new ArrayList<>(List.of(
        new HashMap<>(Map.of("bloodGroup", "A+", "units", 10)),
        new HashMap<>(Map.of("bloodGroup", "A-", "units", 5)),
        new HashMap<>(Map.of("bloodGroup", "B+", "units", 8)),
        new HashMap<>(Map.of("bloodGroup", "B-", "units", 3)),
        new HashMap<>(Map.of("bloodGroup", "O+", "units", 15)),
        new HashMap<>(Map.of("bloodGroup", "O-", "units", 4)),
        new HashMap<>(Map.of("bloodGroup", "AB+", "units", 6)),
        new HashMap<>(Map.of("bloodGroup", "AB-", "units", 2))
    ));

    @GetMapping
    public List<Map<String, Object>> getStock() {
        return stock;
    }

    @PostMapping
    public Map<String, String> addStock(
            @RequestBody Map<String, Object> item) {

        stock.add(new HashMap<>(item));

        return Map.of("message", "Stock added successfully");
    }
}
