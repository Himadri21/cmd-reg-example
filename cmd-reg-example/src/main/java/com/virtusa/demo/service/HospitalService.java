package com.virtusa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.demo.model.Hospital;
import com.virtusa.demo.repository.HospitalRepository;

@Service
public class HospitalService {
	
	@Autowired
	private HospitalRepository hospitalRepository;
	

	// fetching all department
	public List<Hospital> getAllHospitals(){
		List<Hospital> hospital = (List<Hospital>)hospitalRepository.findAll(); 
		return hospital;
	}
	
	// fetching department by id
	public Optional<Hospital> getHospital(Integer id){
		return hospitalRepository.findById(id);
	}
	
	// inserting department
	public void addHospital(Hospital h) {
		hospitalRepository.save(h);
	}
	
	// updating department by id
	public void updateHospital(Hospital h, Integer id){
		if(id == h.getHospitalID()) {
			hospitalRepository.save(h);
		}
	}
	
	// deleting all hospitals
	public void deleteAllHospital(){
		hospitalRepository.deleteAll();
	}
	
	// deleting hospital by id
	public void deleteHospitalByID(Integer id){
		hospitalRepository.deleteById(id);
	}
	
	//patching/updating hospital by id
	public void patchHospital(Hospital h, Integer id) {
		if(id == h.getHospitalID()) {
			hospitalRepository.save(h);
		}
	}
}
