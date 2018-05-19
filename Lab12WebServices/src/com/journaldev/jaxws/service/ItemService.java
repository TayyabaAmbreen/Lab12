package com.journaldev.jaxws.service;

import com.journaldev.jaxws.beans.SoapService;

public interface ItemService {
	
	public void addItem(SoapService p);
	
	public void deleteItem(String item);
	
	public SoapService getItem(String item);
	
	public SoapService[] getAllItems();
}