<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Approve/Reject</title>
</head>
<body>
<table>
	<tr>
		<td>Leave Application ID </td>
		<td><input type="text" name="laid" value="ID" size=15 maxlength=20/></td>
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
		<td>Leave Type</td>
		<td><input type="text" name="leavetype"  />
	</td>
	</tr>
	<tr>
		<td>Contact Number</td>
		<td><input  type="text" name="contactNumber" value="value" size=15 maxlength=20/></td>
	</tr>	
		
</table>
<input type="submit" value="Submit"> <input type="submit"  value="Reject">
</body>
</html>
