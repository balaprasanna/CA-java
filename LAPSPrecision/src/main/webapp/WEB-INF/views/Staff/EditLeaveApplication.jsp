<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.10.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.2/jquery-ui.js"></script>
<script>
	$(function() {
		
		$(".datepicker").datepicker()
	
	
	});
	
</script>

<title>Leave Application</title>
</head>
<body>
<%-- <c:url var="url" value="/Staff/manageLeaveApplication/manageLeaveApplication_submit" > 

</c:url> 
 --%>
<c:url var="url" value="/Staff/test" > 

</c:url> 


	<form action="${url}" method="post">
		<table>
			<%-- <tr>
		<td>Leave Application ID </td>
		<td><input type="text" name="laid" value="${param['laid']}" size=15 maxlength=20/></td>
	</tr> --%>
			<tr>
				<td>User ID</td>
				<td><input type="text" name="uid" value="${leaveRecord.UID}" size=15
					maxlength=20 readonly="readonly" /></td>
			</tr>
			
			<tr>
				<td>Start Time</td>
				<td><input type="text" class="datepicker" name="stime" value="${leaveRecord.starttime}"/></td>
			</tr>
			<tr>
				<td>End Time</td>
				<td><input type="text" class="datepicker" name="etime"  value="${leaveRecord.endtime}" /></td>
			</tr>
			<tr>
				<td>Reason</td>
				<td><input type="text" name="reason"  value="${leaveRecord.reason}"
					size=15 maxlength=100 /></td>
			</tr>
			<tr>
				<td>Leave Type</td>
				<td><select name="leavetype" id="selectid">


						<c:forEach var="item" items="${LeaveTypeCollection}"
							varStatus="index">
						
						<c:choose>
						  <c:when test="${ item.leaveType == leaveRecord.leavetype}">
						    <option selected="selected" value="${item.leaveType}">${item.leaveType}</option>
						  </c:when>
						 	<c:when  test="${ item.leaveType != leaveRecord.leavetype}">
						  <option value="${item.leaveType}">${item.leaveType}</option>
						  </c:when>
					
						</c:choose>
						 
						</c:forEach>
				


						<%-- 	
						<c:if test="${ item.leaveType == leaveRecord.leavetype}">
								<option selected="selected" value="${item.leaveType}">${item.leaveType}</option>
							</c:if>		
	<c:forEach  var="item" items="${LeaveTypeCollection}" varStatus="index">
			<option value="${index.count-1}">${item}</option>	
	</c:forEach> 
 --%>

				</select></td>
			</tr>
			<tr>
				<td>Contact Number</td>
				<td><input type="text" name="contactNumber"  value="${leaveRecord.contactNumber}"
					value="" size=15 maxlength=20 /></td>
					
					
			</tr>


		</table>

<input type="hidden" name="lid" value="${leaveRecord.lid}">

		<input type="submit" value="Submit"> 
		 <input type="reset" value="Reset">

	</form>
	
${leaveRecord.lid}
${leaveRecord.UID}

</body>
</html>