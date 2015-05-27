<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Choose Database</h1>
<form:form action="student.do" method="POST" commandName="student">

		<input type="submit" name="action" value="Student" />	
</form:form>

<form:form action="employee.do" method="POST" commandName="employee">

		<input type="submit" name="action" value="Employee" />	
</form:form>
	
</body>
</html>