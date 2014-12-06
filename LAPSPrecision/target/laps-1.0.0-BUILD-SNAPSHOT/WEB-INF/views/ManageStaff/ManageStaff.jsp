<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>
			<b><u>Manage Staff</u></b>
		</h1>
		<hr>
		<form action="#">
			<table>
				<tr>
					<td>User ID</td>
					<td><input type="text" name="id"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<br>
				<tr>
					<td>Date of Birth</td>
					<td><input type="date" name="date"></td>
				</tr>
				<br>
				<tr>
					<td>EmailID</td>
					<td><input ="text" name="emailid"></td>
				</tr>
				<tr>
					<td>DepartmentID</td>
					<td><input ="text" name="did"></td>
				</tr>
				<tr>
					<td>ReportsTo</td>
					<td><input ="text" name="rto"></td>
				</tr>
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
					<td>Status</td>
					<td><textarea name="status"></textarea></td>
				</tr>
				<br>
				<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
				
			</table>
		</form>
		<br>
		<hr>
		
		<table class="borderAll" border=1>
            <tr>
               <th>ID</th>
                <th>Name</th>
                <th>DOB</th>
                <th>Email ID</th>
                <th>Department ID</th>
                <th>reports to</th>
                <th>Role</th>
                <th>Status</th>
            </tr>
           
            <tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td><a href="#">update</a>&nbsp&nbsp<a href="#">delete</a></td>
			</tr>
				
        </table>


	</center>

</body>
</html>