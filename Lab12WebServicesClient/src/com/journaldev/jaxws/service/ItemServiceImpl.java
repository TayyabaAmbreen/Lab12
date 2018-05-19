/**
 * ItemServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.journaldev.jaxws.service;

public interface ItemServiceImpl extends java.rmi.Remote {
    public com.journaldev.jaxws.beans.SoapService getItem(java.lang.String item) throws java.rmi.RemoteException;
    public void addItem(com.journaldev.jaxws.beans.SoapService p) throws java.rmi.RemoteException;
    public com.journaldev.jaxws.beans.SoapService[] getAllItems() throws java.rmi.RemoteException;
    public void deleteItem(java.lang.String i) throws java.rmi.RemoteException;
}
