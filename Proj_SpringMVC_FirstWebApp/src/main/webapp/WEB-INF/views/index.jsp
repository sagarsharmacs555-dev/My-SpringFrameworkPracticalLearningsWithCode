<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.jar.Attributes.Name"%>
<%@ page import="java.util.List" %>
<html>
<body>
<h2>Hello Wor!afa</h2>

<h1>This is my Spring MVC</h1>
<h1>This is index.jsp file</h1>

<%
	Object obj = (String)request.getAttribute("name");
    List<String> friends = (List<String>) request.getAttribute("f");
%>

<h1>My name is <%=obj %> </h1>

<%

	for(String s:friends)
	{
		
	
	
%>

<h1> <%=s  %> </h1>

<% 
	}
%>




</body>
</html>