<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<script>
	$(function() {
		
		$(".datepicker").datepicker()
	
	
	});
</script>
</head>
<body>
	<center>
		<h1>Manage Staff</h1>
		<a href="${pageContext.request.contextPath}/">Home page</a>

		<form:form method="POST" commandName="user"
			action="${pageContext.request.contextPath}/Admin/ManageStaff_Edit/${user.UID}.html">

			<table>
				<tbody>
					<tr>
						<td>UID :</td>
						<td><form:input path="UID" readonly="readonly" /></td>
						<td><form:errors path="UID" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><form:input path="Name" /></td>
						<td><form:errors path="Name" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>DOB :</td>
						<td><form:input path="DOB" class="datepicker" />(eg:01/01/2002)</td>
						<td><form:errors path="DOB" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Email ID :</td>
						<td><form:input path="EmailID" /></td>
						<td><form:errors path="EmailID" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Department ID :</td>
						<td><form:input path="DepartmentID" /></td>
						<td><form:errors path="DepartmentID" cssStyle="color: red;" /></td>
					</tr>

					<tr>
						<td>Report To :</td>
						<td><form:input path="ReportsTo" /></td>
						<td><form:errors path="ReportsTo" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Role :</td>
						<td><form:select path="Role">
								<form:option value="Admin" />
								<form:option value="Staff" />
								<form:option value="Manager" />
							</form:select></td>
						<td><form:errors path="Role" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Password :</td>
						<td><form:password path="Password" /></td>
						<td><form:errors path="Password" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Status :</td>
						<td><form:input path="Status" /></td>
						<td><form:errors path="Status" cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td>Compensation Hours :</td>
						<td><form:input path="CompensationHours" /></td>
						<td><form:errors path="CompensationHours"
								cssStyle="color: red;" /></td>
					</tr>
					<tr>
						<td><input type="submit" value="Update" /></td>
						<td></td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</center>


</body>
</html>