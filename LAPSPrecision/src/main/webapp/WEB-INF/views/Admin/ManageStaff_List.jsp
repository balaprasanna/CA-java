<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Staff</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/Admin/">Home page</a>
<a href="${pageContext.request.contextPath}/Admin/ManageStaff_AddNew">Create New Table</a>

	<center>
	<br>
	<h1 class="h1">Staff List</h1>
	<c:if test="${!empty userList}">
		<table border=1>
			<tr>
				<th width="80">User ID</th>
				<th width="120">Name</th>
				<th width="120">DOB</th>
				<th width="120">Email ID</th>
				<th width="120">Department ID</th>
				<th width="120">Reports To</th>
				<th width="120">Role</th>
				<th width="120">Password</th>
				<th width="120">Status</th>
				<th width="120">Compensation Hours</th>

			</tr>
			<c:forEach var="user" items="${userList}">
				<tr>
					<td><c:out value="${user.UID}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.DOB}" /></td>
					<td><c:out value="${user.emailID}" /></td>
					<td><c:out value="${user.departmentID}" /></td>
					<td><c:out value="${user.reportsTo}" /></td>
					<td><c:out value="${user.role}" /></td>
					<td><c:out value="${user.password}" /></td>
					<td><c:out value="${user.status}" /></td>
					<td><c:out value="${user.compensationHours}" /></td>

					<td><a href="${pageContext.request.contextPath}/staff/edit/${user.UID}.html" >Edit</a>&nbsp&nbsp
						<a href="${pageContext.request.contextPath}/staff/delete/${user.UID}.html">Delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</c:if>
	</center>

</body>
</html>