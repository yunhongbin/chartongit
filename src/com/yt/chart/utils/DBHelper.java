package com.yt.chart.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {
	
	private static Connection conn = null;  
	private static PreparedStatement pst = null; 
	private static ResultSet resultset = null;
    
     DBHelper(){
    	try {
			Class.forName(CommonConstants.MYSQL_DRIVER);
			conn = DriverManager.getConnection(CommonConstants.MYSQL_URL,CommonConstants.MYSQL_USER,CommonConstants.MYSQL_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    public void close(){
    	try{
    		conn.close();
    		pst.close();
    	}catch(SQLException e){
    		e.printStackTrace();
    	}
    }
    public static ResultSet getResult(String sql){
    	try {
    		pst = conn.prepareStatement(sql);
			resultset = pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultset;
    	
    }

}
