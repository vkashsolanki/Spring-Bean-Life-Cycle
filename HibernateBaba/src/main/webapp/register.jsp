<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
<h1>Hi....</h1>
<!-- creating object here -->
<jsp:useBean id="employee" class="com.entity.Employee"></jsp:useBean>
<jsp:useBean id="employeedao" class="com.dao.EmployeeDao"></jsp:useBean>


<%
employeedao.saveEmp(employee);


%>

</body>
</html>