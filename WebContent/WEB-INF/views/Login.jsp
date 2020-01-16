<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	<div align="center">
		<h1>Login Page</h1>

		<form:form action="login" method="get" modelAttribute="user">
			<table>
				<form:hidden path="id" />

				<tr>
					<td>Email</td>
					<td><form:input path="email" /></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><form:input path="password" /></td>
				</tr>

				
				<tr>
					<td colspan="2"><input type="submit" value="check"></td>
				</tr>
			</table>
		</form:form>
	</div>


</body>
</html>