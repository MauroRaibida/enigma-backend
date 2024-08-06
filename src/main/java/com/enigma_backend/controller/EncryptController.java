package com.enigma_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma_backend.service.EncryptService;

@RestController
@RequestMapping("/encrypt")
public class EncryptController {

    private final EncryptService encryptService;

    public EncryptController(EncryptService encryptService) {
        this.encryptService = encryptService;
    }

    @GetMapping("/{letter}")
    public String getEncryptLetter(@PathVariable String letter) {
        return encryptService.encryptLetter(letter);
    }
}
