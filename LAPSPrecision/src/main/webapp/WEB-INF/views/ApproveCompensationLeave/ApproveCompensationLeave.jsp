<%@page import="javax.servlet.descriptor.TaglibDescriptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ApproveLeaveApplication</title>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>User ID</th>
				<th>StartTime</th>
				<th>EndTime</th>
				<th>Reason</th>
				<th>Handle</th>
			</tr>
		</thead>
		<tbody>
		<c:foreach var="compensation" item="${compensations}" varStatus="status">
			<tr>
				<td>${compensation.userid}</td>
				<td>${compensation.starttime}</td>
				<td>${compensation.endtime}</td>
				<td>${compensation.reason}</td>
				<td><c:if test="${compensation.status}==0"></c:if>		
				<button>Approve</button>
				<c:if test="${compensation.status}==1"></c:if>	
					<button>Reject</button></td>
			</tr>
			</c:foreach>	
		</tbody>

	</table>
</body>
</html>