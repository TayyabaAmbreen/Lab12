package com.journaldev.jaxws.service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.journaldev.jaxws.beans.SoapService;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ItemServiceImpl implements ItemService{

	@Override
	public void addItem(SoapService p) {
        
        java.sql.Connection conn = null;
        Statement stmt = null;
        //JOptionPane.showMessageDialog(null, pswrd);
                
		   try{
		      //STEP 2: Register JDBC driver
			   Class.forName("com.mysql.jdbc.Driver").newInstance();
			   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
			   java.sql.Statement st = conn.createStatement();
			   st.executeUpdate("insert into items values (default, '"+p.getItem()+"', '"+p.getPrice()+"', '"+p.getQuantity()+"', '"+p.getPtime()+"')" );
		         		           
		   }
				   
		   catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
	}

	@Override
	public void deleteItem(String i) {
		  java.sql.Connection conn = null;
	        Statement stmt = null;
	        //JOptionPane.showMessageDialog(null, pswrd);
	        
	        
			   try{
			      //STEP 2: Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver").newInstance();
				   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
				   java.sql.Statement st = conn.createStatement();
				   //st.executeUpdate("insert into items values (default, '"+p.getItem()+"', '"+p.getPrice()+"', '"+p.getQuantity()+"')" );
				   st.executeUpdate("delete from items where Item = '"+i+"' " );      
			   }
			
			   
			   catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
	}

	@Override
	public SoapService getItem(String item) {
		  java.sql.Connection conn = null;
	        Statement stmt = null;
	        //JOptionPane.showMessageDialog(null, pswrd);
	        SoapService s=new SoapService();
	        
			   try{
			      //STEP 2: Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver").newInstance();
				   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
				   java.sql.Statement st = conn.createStatement();
				   //st.executeUpdate("insert into items values (default, '"+p.getItem()+"', '"+p.getPrice()+"', '"+p.getQuantity()+"')" );
				   ResultSet rs1=st.executeQuery("select * from items where Item='"+item+"'");  
				   
				      while(rs1.next())         
				      {
				        s.setItem(rs1.getString("Item"));
				        s.setPrice(rs1.getInt("Price"));
				        s.setQuantity(rs1.getInt("Quantity"));
				        s.setPtime(rs1.getInt("PrepTime"));
				        //System.out.print(rs1.getString(1));
				        
				      }
			   }
			
			   
			   catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   
			   return s;
	}

	@Override
	public SoapService[] getAllItems() {
		
		  java.sql.Connection conn = null;
	        Statement stmt = null;
	        //JOptionPane.showMessageDialog(null, pswrd);
	        SoapService[] s=new SoapService[5];
	        
			   try{
			      //STEP 2: Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver").newInstance();
				   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
				   java.sql.Statement st = conn.createStatement();
				   //st.executeUpdate("insert into items values (default, '"+p.getItem()+"', '"+p.getPrice()+"', '"+p.getQuantity()+"')" );
				   ResultSet rs1=st.executeQuery("select * from items");  
				   int i=0;
				      while(rs1.next())         
				      {
				    	  SoapService p=new SoapService();
				        p.setItem(rs1.getString("Item"));
				        p.setPrice(rs1.getInt("Price"));
				        p.setQuantity(rs1.getInt("Quantity"));
				        p.setPtime(rs1.getInt("PrepTime"));
				        s[i]=p;
				        i++;
				        
				      }
			   
			   }
			   
			   catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   
			   return s;
	}
}
