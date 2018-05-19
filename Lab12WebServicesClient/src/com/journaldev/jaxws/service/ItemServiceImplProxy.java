package com.journaldev.jaxws.service;

public class ItemServiceImplProxy implements com.journaldev.jaxws.service.ItemServiceImpl {
  private String _endpoint = null;
  private com.journaldev.jaxws.service.ItemServiceImpl itemServiceImpl = null;
  
  public ItemServiceImplProxy() {
    _initItemServiceImplProxy();
  }
  
  public ItemServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initItemServiceImplProxy();
  }
  
  private void _initItemServiceImplProxy() {
    try {
      itemServiceImpl = (new com.journaldev.jaxws.service.ItemServiceImplServiceLocator()).getItemServiceImpl();
      if (itemServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)itemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)itemServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (itemServiceImpl != null)
      ((javax.xml.rpc.Stub)itemServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.journaldev.jaxws.service.ItemServiceImpl getItemServiceImpl() {
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl;
  }
  
  public com.journaldev.jaxws.beans.SoapService getItem(java.lang.String item) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.getItem(item);
  }
  
  public void addItem(com.journaldev.jaxws.beans.SoapService p) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    itemServiceImpl.addItem(p);
  }
  
  public com.journaldev.jaxws.beans.SoapService[] getAllItems() throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    return itemServiceImpl.getAllItems();
  }
  
  public void deleteItem(java.lang.String i) throws java.rmi.RemoteException{
    if (itemServiceImpl == null)
      _initItemServiceImplProxy();
    itemServiceImpl.deleteItem(i);
  }
  
  
}