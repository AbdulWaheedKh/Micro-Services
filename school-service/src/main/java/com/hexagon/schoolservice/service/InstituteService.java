package com.hexagon.schoolservice.service;

import com.hexagon.schoolservice.entity.Institute;
import com.hexagon.schoolservice.repository.InstituteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstituteService {

    @Autowired
    InstituteRepository instituteRepository;

    public List<Institute> getAllProfiles() {

        List<Institute> instList = instituteRepository.findAllByInstitutes();
        System.out.println(instList.toString());

        return instList;
    }
}
