package com.virtusa.demo.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.demo.model.Hospital;
import com.virtusa.demo.service.HospitalService;

@RestController
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/hospital")
	public List<Hospital> getAllHospital(){
		return hospitalService.getAllHospitals();
	}
	
	@GetMapping("/hospital/{id}")
	public Optional<Hospital> getHospital(@PathVariable Integer id) {
		return hospitalService.getHospital(id);
	}
	
	@PostMapping("/hospital")
	public void addHospital(@RequestBody Hospital hospital) {
		hospitalService.addHospital(hospital);
	}
	
	@PutMapping("/hospital/{id}")
	public void updateHospital(@RequestBody Hospital h,@PathVariable Integer id) {
		hospitalService.updateHospital(h, id);
	}
	
	@DeleteMapping("/hospital")
	public void deleteAllHospitals() {
		hospitalService.deleteAllHospital();
	}
	
	@DeleteMapping("/hospital/{id}")
	public void deleteHospitalByID(@RequestBody Hospital h,@PathVariable Integer id) {
		hospitalService.deleteHospitalByID(id);
	}
	
	@PatchMapping("/hospital/{id}")
	public void patchHospitalByID(@RequestBody Hospital h,@PathVariable Integer id){
		hospitalService.patchHospital(h, id);
	}
}
