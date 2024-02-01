package com.hexagon.studentservice.controller;


import com.hexagon.studentservice.model.StudentProfie;
import com.hexagon.studentservice.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/studentProfileAPI")
public class StudentProfileController {

    @Autowired
    private StudentProfileService studentProfileService; // Assume you have a service to handle business logic

    @Autowired
    private RestTemplate restTemplate;


    // Endpoint to retrieve all profiles
    @GetMapping("/getAllStudentProfiles")
    public ResponseEntity<List<StudentProfie>> getAllProfiles() {
        List<StudentProfie> profiles = studentProfileService.getAllProfiles();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

//    Inter communication between services

    @GetMapping("/school")
    public List<Object> getSchool() {
        Object[] objects = restTemplate.getForObject("http://SCHOOL-SERVICE/instituteAPI/getAllProfiles", Object[].class);
        System.out.println(objects.toString());
        return Arrays.asList(objects);
    }



}
