package com.hexagon.studentservice.repository;

import com.hexagon.studentservice.model.StudentProfie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentProfileRepository extends JpaRepository<StudentProfie,Long> {

    @Query("SELECT i FROM StudentProfie i")
    List<StudentProfie> findAllByInstitutes();
}
