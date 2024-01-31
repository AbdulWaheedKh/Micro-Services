package com.hexagon.schoolservice.controller;

import com.hexagon.schoolservice.entity.Institute;
import com.hexagon.schoolservice.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RequestMapping(value = "/instituteAPI")
@RestController
public class InstituteController {

    @Autowired
    private InstituteService instituteService; // Assume you have a service to handle business logic


    // Endpoint to retrieve all profiles
    @GetMapping("/getAllProfiles")
    public ResponseEntity<List<Institute>> getAllProfiles() {
        List<Institute> profiles = instituteService.getAllProfiles();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }


}
