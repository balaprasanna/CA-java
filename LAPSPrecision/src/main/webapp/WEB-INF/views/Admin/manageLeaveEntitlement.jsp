<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manage Leave Entitlement</title>
</head>
<body>

	<center>
		<h1>
			<b><u>Manage Leave Entitlement</u></b>
		</h1>
		<hr>
		<form action="#">
			<table>
								
				<tr>
					<td>Role</td>
					<td>
					<select>
						<option>Admin</option>
						<option>Staff</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Leave Type</td>
					<td>
					<select>
						<option>Annual </option>
						<option>Medical</option>
					</select>
					</td>
				</tr>
				<tr>
					<td>Number of Days</td>
					<td><input ="text" name="NOD"></td>
				</tr>
					
				<tr>
					<td><input type="submit" value="Submit"></td>
				</tr>
				
			</table>
		</form>
		<br>
		<hr>


	</center>


</body>
</html>