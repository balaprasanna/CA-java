<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Application </title>
</head>
<body>
<table>

		<tr>
		<td>Start Time</td>
		<td><input type="datetime-local"  name="stime"/>
		
		</td>
	</tr>
	<tr>
		<td>End Time</td>
		<td><input type="datetime-local" name="etime"/>
		
		</td>
	<tr>
		<td>Reason</td>
		<td><input  type="text" name="reason" value="reason" size=15 maxlength=100/></td>
	</tr>
		
</table>
<input type="submit" value="Claim"> 
</body>
</html>