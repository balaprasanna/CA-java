<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Staff home
<br>
<a href="${pageContext.request.contextPath}/submitLeaveApplication">
Submit Leave Application
</a>

<br>

<a href="${pageContext.request.contextPath}/manageLeaveApplication">
Manage Leave Application
</a>

<br>

<a href="${pageContext.request.contextPath}/claimLeaveCompensation">
Claim Leave Compensation
</a>

<br>

<a href="${pageContext.request.contextPath}/viewPersonalLeaveHistory">
View Personal Leave History
</a>

<br>

</body>
</html>