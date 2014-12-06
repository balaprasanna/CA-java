<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Application</title>
</head>
<body>
<form action="" method=post>
<table>
	<tr>
		<td>Leave Application ID </td>
		<td><input type="text" name="laid" value="${param['laid']}" size=15 maxlength=20/></td>
	</tr>
	<tr>
		<td>User ID </td>
		<td><input type="text" name="uid" value="${param['laid']}" size=15 maxlength=20/></td>
	</tr>
	<tr>
		<td>Start Time</td>
		<td><input type="datetime-local"  name="stime"/>
		
		</td>
	</tr>
	<tr>
		<td>End Time</td>
		<td><input type="datetime-local" name="etime"  />
		
		</td>
	</tr>
	<tr>
		<td>Reason</td>
		<td><input  type="text" name="reason" value="${param['reason']}" size=15 maxlength=100/></td>
	</tr>
	<tr>
		<td>Leave Type</td>
		<td>
			<select name="leavetype">
				<option value="0">Annual</option>
				<option value="1">Medical</option>
				<option value="2">Compensation</option>
			</select>
		</td>
	</tr>
	<tr>
		<td>Contact Number</td>
		<td><input  type="text" name="contactNumber" value="${param['reason']}" size=15 maxlength=20/></td>
	</tr>
		
		
</table>
<input type="submit" value="Submit"> <input type="submit"  value="Update"> <input type="reset"  value="Reset">
</form>
</body>
</html>