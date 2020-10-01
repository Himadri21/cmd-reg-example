package com.virtusa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="device")
public class Device {
	
	@Id
	@Column(name="deviceID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer deviceID;
	
	@NotNull
	@Column(name="deviceName")
	private String deviceName;
	
	@Column(name="assetNumber")
	private Double assetNumber;
	
	@Column(name="modelNumber")
	private String modelNumber;
	
	@Column(name="manufactureDate")
	private String manufactureDate;
	
	@Column(name="deviceStatus")
	private String deviceStatus;
	
	@Column(name="batteryLevel")
	private String batteryLevel;
	
	@Column(name="operatingTime")
	private Integer operatingTime;
	
	@Column(name="receivedDate")
	private String receivedDate;
	
	@Column(name="servicePeriod")
	private String servicePeriod;
	
	@Column(name="serialNumber")
	private String serialNumber;
	
	@NotNull
	@ManyToOne
	@JoinColumn
	private Hospital hospital;

	public Device() {
		
	}
	
	public Device(Integer deviceID, @NotNull String deviceName, Double assetNumber, String modelNumber,
			String manufactureDate, String deviceStatus, String batteryLevel, Integer operatingTime,
			String receivedDate, String servicePeriod, String serialNumber, Hospital hospital) {
		super();
		this.deviceID = deviceID;
		this.deviceName = deviceName;
		this.assetNumber = assetNumber;
		this.modelNumber = modelNumber;
		this.manufactureDate = manufactureDate;
		this.deviceStatus = deviceStatus;
		this.batteryLevel = batteryLevel;
		this.operatingTime = operatingTime;
		this.receivedDate = receivedDate;
		this.servicePeriod = servicePeriod;
		this.serialNumber = serialNumber;
		this.hospital = hospital;
	}


	public Integer getDeviceid() {
		return deviceID;
	}
	
	public void setDeviceid(Integer deviceID) {
		this.deviceID = deviceID;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public Double getAssetNumber() {
		return assetNumber;
	}

	public void setAssetNumber(Double assetNumber) {
		this.assetNumber = assetNumber;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getDeviceStatus() {
		return deviceStatus;
	}

	public void setDeviceStatus(String deviceStatus) {
		this.deviceStatus = deviceStatus;
	}

	public String getBatteryLevel() {
		return batteryLevel;
	}

	public void setBatteryLevel(String batteryLevel) {
		this.batteryLevel = batteryLevel;
	}

	public Integer getOperatingTime() {
		return operatingTime;
	}

	public void setOperatingTime(Integer operatingTime) {
		this.operatingTime = operatingTime;
	}

	public String getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(String receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getServicePeriod() {
		return servicePeriod;
	}

	public void setServicePeriod(String servicePeriod) {
		this.servicePeriod = servicePeriod;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Device{" +
	            "id=" + deviceID +
	            ", devceName='" + deviceName + '\'' +
	            ", assetName='" + assetNumber+ '\'' +
	            ", modelNumber='" + modelNumber + '\'' +
	            ", manufactureDate='" + manufactureDate + '\'' +
	            ", deviceStatus=" + deviceStatus + '\'' + 
	            ", batteryLevel=" + batteryLevel + '\'' + 
	            ", operatingTime=" + operatingTime + '\'' + 
	            ", receivedDate=" + receivedDate + '\'' + 
	            ", serialNumber=" + serialNumber + '\'' + 
	            ", hospital ID" + hospital.getHospitalName() + '\'' + 
	            '}';
	}
}
