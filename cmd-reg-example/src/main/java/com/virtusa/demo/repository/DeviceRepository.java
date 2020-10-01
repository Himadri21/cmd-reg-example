package com.virtusa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.demo.model.Device;

public interface DeviceRepository extends JpaRepository<Device,Integer>{

}
