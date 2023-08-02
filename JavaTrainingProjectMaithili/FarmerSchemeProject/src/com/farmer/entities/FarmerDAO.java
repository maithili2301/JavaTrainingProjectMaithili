package com.farmer.entities;

public interface FarmerDAO { //POJI as per POJO
	public void insertFarmer(FarmerEntity farmerEntity);
//	public void insertFarmer(FarmerEntity farmerEntity);
	public FarmerEntity selectFarmer(String aadharCard);
	public void updateFarmer(FarmerEntity farmerEntity);
	public void deletFarmer(String aadharCard);
	
  
}
