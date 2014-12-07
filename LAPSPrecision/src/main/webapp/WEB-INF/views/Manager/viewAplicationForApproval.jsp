<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table cellpadding=6 cellspacing=4 border=0>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>View Detail</th>
			</tr>
			<c:forEach var="leave" items="${leaveform}" begin="0" end="${size}"
				varStatus="status">
				<tr>
					<td><c:out value="${status.index+1 }" /></td>
					<td><c:out value="${leave.firstname}" /></td>
					<td><c:url var="view" scope="page" value="viewdetail.jsp">
							<c:param name="staffid" value="${leave.staffid}"></c:param>
							<c:param name="name" value="${leave.firstname}"></c:param>
							<c:param name="createdate" value="${leave.createddate}"></c:param>
							<c:param name="startdate" value="${leave.startdate}"></c:param>
							<c:param name="enddate" value="${leave.enddate}"></c:param>
							<c:param name="daystaken" value="${leave.daystaken}"></c:param>
							<c:param name="reason" value="${leave.reason}"></c:param>

							<!--   		<th>Leave application id</th>
						        		<th>UID </th>
						        		<th> Start date</th>
						        		<th> Finish date</th>
						        		<th>No of days</th>
						        		<th>Reason</th>
						        		<th>Status</th>
						       -->
						</c:url> <a href="${view}"><c:out value="View Detail" /></a></td>
				</tr>
			</c:forEach>
		</table>

	</center>
</body>
</html>