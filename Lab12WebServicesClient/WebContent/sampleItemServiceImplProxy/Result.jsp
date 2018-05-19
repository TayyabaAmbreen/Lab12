<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleItemServiceImplProxyid" scope="session" class="com.journaldev.jaxws.service.ItemServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleItemServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleItemServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleItemServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.journaldev.jaxws.service.ItemServiceImpl getItemServiceImpl10mtemp = sampleItemServiceImplProxyid.getItemServiceImpl();
if(getItemServiceImpl10mtemp == null){
%>
<%=getItemServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String item_1id=  request.getParameter("item26");
            java.lang.String item_1idTemp = null;
        if(!item_1id.equals("")){
         item_1idTemp  = item_1id;
        }
        com.journaldev.jaxws.beans.SoapService getItem15mtemp = sampleItemServiceImplProxyid.getItem(item_1idTemp);
if(getItem15mtemp == null){
%>
<%=getItem15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">item:</TD>
<TD>
<%
if(getItem15mtemp != null){
java.lang.String typeitem20 = getItem15mtemp.getItem();
        String tempResultitem20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeitem20));
        %>
        <%= tempResultitem20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">quantity:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ptime:</TD>
<TD>
<%
if(getItem15mtemp != null){
%>
<%=getItem15mtemp.getPtime()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 28:
        gotMethod = true;
        String price_3id=  request.getParameter("price33");
        int price_3idTemp  = Integer.parseInt(price_3id);
        String item_4id=  request.getParameter("item35");
            java.lang.String item_4idTemp = null;
        if(!item_4id.equals("")){
         item_4idTemp  = item_4id;
        }
        String quantity_5id=  request.getParameter("quantity37");
        int quantity_5idTemp  = Integer.parseInt(quantity_5id);
        String ptime_6id=  request.getParameter("ptime39");
        int ptime_6idTemp  = Integer.parseInt(ptime_6id);
        %>
        <jsp:useBean id="com1journaldev1jaxws1beans1SoapService_2id" scope="session" class="com.journaldev.jaxws.beans.SoapService" />
        <%
        com1journaldev1jaxws1beans1SoapService_2id.setPrice(price_3idTemp);
        com1journaldev1jaxws1beans1SoapService_2id.setItem(item_4idTemp);
        com1journaldev1jaxws1beans1SoapService_2id.setQuantity(quantity_5idTemp);
        com1journaldev1jaxws1beans1SoapService_2id.setPtime(ptime_6idTemp);
        sampleItemServiceImplProxyid.addItem(com1journaldev1jaxws1beans1SoapService_2id);
break;
case 41:
        gotMethod = true;
        com.journaldev.jaxws.beans.SoapService[] getAllItems41mtemp = sampleItemServiceImplProxyid.getAllItems();
if(getAllItems41mtemp == null){
%>
<%=getAllItems41mtemp %>
<%
}else{
        String tempreturnp42 = null;
        if(getAllItems41mtemp != null){
        java.util.List listreturnp42= java.util.Arrays.asList(getAllItems41mtemp);
        tempreturnp42 = listreturnp42.toString();
        }
        %>
        <%=tempreturnp42%>
        <%
}
break;
case 44:
        gotMethod = true;
        String i_7id=  request.getParameter("i47");
            java.lang.String i_7idTemp = null;
        if(!i_7id.equals("")){
         i_7idTemp  = i_7id;
        }
        sampleItemServiceImplProxyid.deleteItem(i_7idTemp);
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>