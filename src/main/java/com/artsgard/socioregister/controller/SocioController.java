package com.artsgard.socioregister.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/socio")
public class SocioController {
    
    @GetMapping(path = "/starter")
    public ResponseEntity<?> starter() {
        return new ResponseEntity<>("Socio Starter", HttpStatus.OK);
    }
}
