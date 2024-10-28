package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Flower;

@RestController
@RequestMapping("/api/v1/flowers")
public class FlowerController {

    @GetMapping
    public List<Flower> getFlowers() {
        return List.of(
            new Flower("Rose", "Red"),
            new Flower("Tulip", "Yellow")
        );
    }
}