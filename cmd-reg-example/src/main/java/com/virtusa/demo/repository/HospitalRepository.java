package com.virtusa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.demo.model.Hospital;

public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

}
