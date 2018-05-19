/**
 * ItemServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.journaldev.jaxws.service;

public class ItemServiceImplServiceLocator extends org.apache.axis.client.Service implements com.journaldev.jaxws.service.ItemServiceImplService {

    public ItemServiceImplServiceLocator() {
    }


    public ItemServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ItemServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ItemServiceImpl
    private java.lang.String ItemServiceImpl_address = "http://localhost:8080/Lab12WebServices/services/ItemServiceImpl";

    public java.lang.String getItemServiceImplAddress() {
        return ItemServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ItemServiceImplWSDDServiceName = "ItemServiceImpl";

    public java.lang.String getItemServiceImplWSDDServiceName() {
        return ItemServiceImplWSDDServiceName;
    }

    public void setItemServiceImplWSDDServiceName(java.lang.String name) {
        ItemServiceImplWSDDServiceName = name;
    }

    public com.journaldev.jaxws.service.ItemServiceImpl getItemServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ItemServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getItemServiceImpl(endpoint);
    }

    public com.journaldev.jaxws.service.ItemServiceImpl getItemServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.journaldev.jaxws.service.ItemServiceImplSoapBindingStub _stub = new com.journaldev.jaxws.service.ItemServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getItemServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setItemServiceImplEndpointAddress(java.lang.String address) {
        ItemServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.journaldev.jaxws.service.ItemServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.journaldev.jaxws.service.ItemServiceImplSoapBindingStub _stub = new com.journaldev.jaxws.service.ItemServiceImplSoapBindingStub(new java.net.URL(ItemServiceImpl_address), this);
                _stub.setPortName(getItemServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ItemServiceImpl".equals(inputPortName)) {
            return getItemServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.jaxws.journaldev.com", "ItemServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.jaxws.journaldev.com", "ItemServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ItemServiceImpl".equals(portName)) {
            setItemServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
