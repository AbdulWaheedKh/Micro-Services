package com.hexagon.studentservice.service;

import com.hexagon.studentservice.model.StudentProfie;
import com.hexagon.studentservice.repository.StudentProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileService {

    @Autowired
    StudentProfileRepository studentProfileRepository;

    public List<StudentProfie> getAllProfiles() {

        List<StudentProfie> studentProfieList = studentProfileRepository.findAllByInstitutes();
        System.out.println(studentProfieList.toString());

        return studentProfieList;
    }

}
