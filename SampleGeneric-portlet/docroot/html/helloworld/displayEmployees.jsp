<%@page import="java.util.Map"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<portlet:defineObjects />
<h1>Display Employee Details</h1>
<%
Map<String,String> employeeMap=(Map<String,String>)renderRequest.getAttribute("employeeMap");
if(employeeMap!=null){
%>
Emplyee Name: <%=employeeMap.get("employeeName")%>	<br/>
Emplyee Address: <%=employeeMap.get("employeeAddress")%><b/>
<%}%>


