<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Personal Leave History</title>
</head>
<body>
	<center>
		<table cellpadding=6 cellspacing=4 border=0>
			<tr>
				<th>#</th>
				<th>Name</th>
				<th>StartTime</th>
				<th>EndTime</th>
				<th>LeaveType</th>
				<th>Reason</th>
				<th>Remark</th>
				<th>ContactNumber</th>
				<th>Status</th>
	
			</tr>
			<!--  begin="0" end="${size}" -->
			 <c:forEach var="leave" items="${leaveApplicationList}" varStatus="status">
				<tr>
					<td>
						<c:out value="${status.index+1 }"/>
						
					</td>
					<td>
						<c:out value="${leave.UID }"/>
						
					</td>
					<td>
						<c:out value="${leave.starttime}"/>
					</td>
					<td>
						<c:out value="${leave.endtime }"/>
					</td>
					<td>
						<c:out value="${leave.leavetype}"/>
					</td>
					<td>
						<c:out value="${leave.reason }"/>
					</td>
					<td>
						<c:out value="${leave.remarks}"/>
					</td>
					<td>
						<c:out value="${leave.contactNumber }"/>
					</td>
					<td>
						<c:out value="${leave.status}"/>
					</td>
					 <td>
						<c:url var="view" scope="page" value="/Staff/manageLeaveApplication/manageLeaveApplication_edit">
						<c:param name="lid" value="${leave.lid}"></c:param>
						<c:param name="uid" value="${leave.UID}"></c:param>
						<c:param name="starttime" value="${leave.starttime}"></c:param>
						<c:param name="endtime" value="${leave.endtime}"></c:param>
						<c:param name="leavetype" value="${leave.leavetype}"></c:param>
						<c:param name="reason" value="${leave.reason}"></c:param>
						<c:param name="remarks" value="${leave.remarks}"></c:param>
						<c:param name="contactNumber" value="${leave.contactNumber}"></c:param>
						<c:param name="status" value="${leave.status}"></c:param>
						
					</c:url>
					<a href="${view}"><c:out value="Edit"/></a> 
					
					</td>
					<td>
					<c:url var="delete" scope="page" value="/Staff/manageLeaveApplication/manageLeaveApplication_delete">
						<c:param name="lid" value="${leave.lid}"></c:param>
						</c:url>
						<a href="${delete}"><c:out value="Delete"/></a> 
					</td>
				</tr>
			</c:forEach>
		</table>
	
	</center>
</body>
</html>