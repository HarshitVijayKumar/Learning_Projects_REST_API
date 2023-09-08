package com.springrest.springrest.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Loads {
	
	@Id
	private Long loadId;
	private String loadingPoint;
	private String unloadingPoint;
	private String productType;
	private String truckType;
	private String noOfTrucks;
	private String weight;
	private String userComment;
	private String shipperId;
	private String transport_Date;
	public Loads(Long loadId, String loadingPoint, String unloadingPoint, String productType, String truckType, String noOfTrucks,
			String weight, String comment, String shipperId, String transport_date) {
		super();
		this.loadId = loadId;
		this.loadingPoint = loadingPoint;
		this.unloadingPoint = unloadingPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.userComment = comment;
		this.shipperId = shipperId;
		transport_Date = transport_date;
	}
	public Loads() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getLoadId() {
		return loadId;
	}
	public String getLoadingPoint() {
		return loadingPoint;
	}
	public void setLoadId(Long loadId) {
		this.loadId = loadId;
	}
	public void setLoadingPoint(String loadingPoint) {
		this.loadingPoint = loadingPoint;
	}
	public String getUnloadingPoint() {
		return unloadingPoint;
	}
	public void setUnloadingPoint(String unloadingPoint) {
		this.unloadingPoint = unloadingPoint;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getTruckType() {
		return truckType;
	}
	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}
	public String getNoOfTrucks() {
		return noOfTrucks;
	}
	public void setNoOfTrucks(String noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getComment() {
		return userComment;
	}
	public void setComment(String comment) {
		this.userComment = comment;
	}
	public String getShipperId() {
		return shipperId;
	}
	public void setShipperId(String shipperId) {
		this.shipperId = shipperId;
	}
	public String getDate() {
		return transport_Date;
	}
	public void setDate(String transport_date) {
		transport_Date = transport_date;
	}
	@Override
	public String toString() {
		return "Load [loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType="
				+ productType + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight
				+ ", comment=" + userComment + ", shipperId=" + shipperId + ", Date=" + transport_Date + "]";
	}
	
}
