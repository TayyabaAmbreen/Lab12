package com.pegaxchange.java.web.rest;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.mysql.jdbc.Statement;
import com.pegaxchange.java.bean.Product;
import com.pegaxchange.java.bean.Status;

@Path("productcatalog")
public class ProductCatalogResource {
    private static List productCatalog;
    public ProductCatalogResource() {
        initializeProductCatalog();
    }
    
    @POST
    @Path("insert")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Status insert(Product p) {
    	java.sql.Connection conn = null;
        Statement stmt = null;
        //JOptionPane.showMessageDialog(null, pswrd);
                
		   try{
		      //STEP 2: Register JDBC driver
			   Class.forName("com.mysql.jdbc.Driver").newInstance();
			   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
			   java.sql.Statement st = conn.createStatement();
			   st.executeUpdate("insert into orders values (default, '"+p.getUId()+"', '"+p.getOdate()+"', '"+p.getItem()+"')" );
		         		           
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
        return new Status("SUCCESS", "Inserted " + p.getItem());
    }
    
    private void initializeProductCatalog() {
    	  java.sql.Connection conn = null;
	        Statement stmt = null;
	        //JOptionPane.showMessageDialog(null, pswrd);
	        //SoapService[] s=new SoapService[5];
	        
			   try{
			      //STEP 2: Register JDBC driver
				   Class.forName("com.mysql.jdbc.Driver").newInstance();
				   conn = DriverManager.getConnection("jdbc:mysql://localhost/lab12cafe?useSSL=true", "root","");
				   java.sql.Statement st = conn.createStatement();
				   //st.executeUpdate("insert into order values (default, '"+p.getItem()+"', '"+p.getPrice()+"', '"+p.getQuantity()+"')" );
				   ResultSet rs1=st.executeQuery("select * from orders");  
				   
				      while(rs1.next())         
				      {
				    	  Product p=new Product();
				        p.setUId(rs1.getInt("UserId"));
				        p.setOdate(rs1.getString("OrderDate"));
				        p.setItem(rs1.getString("Item"));
				        
				        productCatalog.add(p);
				       
				        
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
			   
    }
}