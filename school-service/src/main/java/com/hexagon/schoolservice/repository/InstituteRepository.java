package com.hexagon.schoolservice.repository;

import com.hexagon.schoolservice.entity.Institute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstituteRepository extends JpaRepository<Institute,Long > {

    @Query("SELECT i FROM Institute i")
    List<Institute> findAllByInstitutes();

//    List<Institute> findByInstitutesIsNotNull();
}
