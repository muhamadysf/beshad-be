package com.haidar.beshadbe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @GetMapping("/test")
    public ResponseEntity<String> home(){
        return ResponseEntity.ok("Wellcome sir...!");
    }
}
