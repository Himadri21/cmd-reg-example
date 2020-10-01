package com.virtusa.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.demo.repository.DeviceRepository;
import com.virtusa.demo.model.Device;

@Service
public class DeviceService {
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	//fetching all devices
	public List<Device> getAllDevices(){
		List<Device> device=(List<Device>)deviceRepository.findAll();
		return device;
	}
	
	//fetching device by id
	public Optional<Device> getDevice(Integer id) {
		return deviceRepository.findById(id);
	}
	
	//inserting device
	public void addDevice(Device d) {
		deviceRepository.save(d);
	}
	
	//updating device by id
	public void updateDevice(Device dev,Integer id) {
		if(id==dev.getDeviceid()) {
			deviceRepository.save(dev);
		}
	}
	
	public void deleteAllDevices() {
		deviceRepository.deleteAll();
	}
	
	//deleting device by ID
	public void deleteDeviceByID(Integer id) {
		deviceRepository.deleteById(id);
	}
	
	//updating device by Id
	public void patchDevice(Device dev,Integer id) {
		if(id==dev.getDeviceid()) {
			deviceRepository.save(dev);
		}
	}
}
