package com.artsgard.socioregister.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socio")
public class SinglepageController {
    
    @GetMapping(path = "/starter")
    public ResponseEntity<?> starter() {
        return new ResponseEntity<>("single page application starter", HttpStatus.OK);
    }
}
