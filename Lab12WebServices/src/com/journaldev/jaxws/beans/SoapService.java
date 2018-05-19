package com.journaldev.jaxws.beans;

import java.io.Serializable;

public class SoapService {

private static final long serialVersionUID = -5577579081118070434L;
	
	private String item;
	private int price;
	private int quantity;
	private int preptime;

	public String getItem() {
		return item;
	}

	public void setItem(String i) {
		this.item = i;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int p) {
		this.price = p;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int q) {
		this.quantity = q;
	}
	
	public void setPtime(int i) {
		this.preptime = i;
	}

	public int getPtime() {
		return preptime;
	}
	
	@Override
	public String toString(){
		return item+"::"+quantity+"::"+price+"::"+preptime;
	}
}
