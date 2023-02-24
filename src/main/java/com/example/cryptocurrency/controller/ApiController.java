package com.example.cryptocurrency.controller;

import com.example.cryptocurrency.dto.RequestDto;
import com.example.cryptocurrency.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    ApiService apiService;

    @GetMapping("/best-price")
    public String getPrice(@RequestBody RequestDto requestDto){
        try {
            return apiService.getPrice(requestDto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}