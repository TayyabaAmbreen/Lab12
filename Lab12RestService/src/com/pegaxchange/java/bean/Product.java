package com.pegaxchange.java.bean;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Product implements Serializable{
	private static final long serialVersionUID = 6826191735682596960L;
	
    private int uid;
    private String odate;
    private String item;
    
    public Product() {} // needed for JAXB
    public Product(int id, String od, String i) {
        this.uid = id;
        this.odate = od;
        this.item = i;
    }
    
    public int getUId() {
        return uid;
    }
    public void setUId(int id) {
        this.uid = id;
    }
    public String getOdate() {
        return odate;
    }
    public void setOdate(String o) {
        this.odate = o;
    }
    public String getItem() {
        return item;
    }
    public void setItem(String it) {
        this.item = it;
    }
  

}
