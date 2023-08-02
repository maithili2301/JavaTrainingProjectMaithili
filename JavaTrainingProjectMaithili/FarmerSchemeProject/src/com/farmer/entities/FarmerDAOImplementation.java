package com.farmer.entities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FarmerDAOImplementation implements FarmerDAO {
    
	Connection conn;
	
	public FarmerDAOImplementation() {
		try {
			//1. Load the Driver
//			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
//			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
//			System.out.println("Trying to connect....");
			conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
//			System.out.println("Connected : "+ conn);
			
						
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void insertFarmer(FarmerEntity farmerEntity) {
		try {
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO FARMERDETAILS VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			
		   pst.setString(1, farmerEntity.getFarmerName());
		   pst.setString(2, farmerEntity.getPhoneNumber());
		   pst.setString(3, farmerEntity.getEmail());
		   pst.setString(4, farmerEntity.getArea());
		   pst.setString(5, farmerEntity.getCity());
		   pst.setString(6, farmerEntity.getState());
		   pst.setString(7, farmerEntity.getPinCode());
		  
		  
		  
		   pst.setString(8, farmerEntity.getAccountNumber());
		   pst.setString(9, farmerEntity.getIfscCode());
		 
		   pst.setString(10, farmerEntity.getAadharCard());
		   pst.setString(11, farmerEntity.getPanCard());
		   pst.setString(12, farmerEntity.getPassword());
		   
		   
			
//			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			System.out.println("added recoed");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public FarmerEntity selectFarmer(String aadharCard) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateFarmer(FarmerEntity farmerEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletFarmer(String aadharCard) {
		// TODO Auto-generated method stub
		
	}

}
