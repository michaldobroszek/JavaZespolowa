<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="/WEB-INF/jsp/includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Management</title>
</head>
<body>
<h1>Employee Data</h1>
<form:form action="employee.do" method="POST" commandName="employee">
	<table>
		<tr>
			<td>Employee ID</td>
			<td><form:input path="idEmployee" /></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:input path="lastname" /></td>
		</tr> 
		<tr>
			<td> Salary</td>
			<td><form:input path="salary" /></td>
		</tr>
		<tr>
			<td>Position</td>
			<td><form:input path="position" /></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" name="action" value="Add" />
				<input type="submit" name="action" value="Edit" />
				<input type="submit" name="action" value="Delete" />
				<input type="submit" name="action" value="Search" />
			</td>
		</tr>
	</table>
</form:form>
<br>
<table border="1">
	<th>ID</th>
	<th>First name</th>
	<th>Last name</th>
	<th>Salary</th>
	<th>Position</th>
	<c:forEach items="${employeeList}" var="employee">
		<tr>
			<td>${employee.idEmployee}</td>
			<td>${employee.firstname}</td>
			<td>${employee.lastname}</td>
			<td>${employee.salary}</td>
			<td>${employee.position}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>