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
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.demo.model.Device;
import com.virtusa.demo.service.DeviceService;

@RestController
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	
	@GetMapping("/device")
	public List<Device> getAllDevice(){
		return deviceService.getAllDevices();
	}
	
	@GetMapping("/device/{id}")
	public Optional<Device> getDevice(@PathVariable Integer id) {
		return deviceService.getDevice(id);
	}
	
	//inserting device
	@PostMapping("/device/{id}")
	public void addDevice(@RequestBody Device d) {
		deviceService.addDevice(d);
	}
	
	@PutMapping("/device/{id}")
	public void updateDevice(@RequestBody Device d,@PathVariable Integer id) {
		deviceService.updateDevice(d, id);
	}
	
	@DeleteMapping("/device")
	public void deleteAllDevices() {
		deviceService.deleteAllDevices();
	}
	
	@DeleteMapping("/device/{id}")
	public void deleteDeviceByID(@RequestBody Device d,@PathVariable Integer id) {
		deviceService.deleteDeviceByID(id);
	}
	
	@PatchMapping("/device/{id}")
	public void patchDeviceByID(@RequestBody Device d,@PathVariable Integer id) {
		deviceService.patchDevice(d, id);
	}
}
