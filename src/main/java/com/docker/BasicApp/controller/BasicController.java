package com.docker.BasicApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {
    @GetMapping("/test")
    public ResponseEntity<String> getValue(){
        return new ResponseEntity<>("Hey There, Its Working!!", HttpStatus.OK);
    }
}
