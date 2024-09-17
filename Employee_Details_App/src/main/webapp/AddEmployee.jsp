<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
import="java.util.*,test.EmployeeBean"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.addEmployee {
    color: green;
    background-color: #ddffdd;
    padding: 10px;
    margin: 20px 0;
    border: 1px solid green;
    border-radius: 5px;
}
</style>
<body class="addEmployee">
		<%
			out.println("Employee Details Added Successfully...<br>");
			%>
	<%@include file="home.html"%>
</body>
</html>