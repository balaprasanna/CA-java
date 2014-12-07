<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Manager home
<br>
<a href="${pageContext.request.contextPath}/Manager/viewAplicationForApproval">
View Application For Approval
</a>

<br>

<a href="${pageContext.request.contextPath}/Manager/viewEmployeeLeaveHistory">
View Employee Leave History
</a>

<br>

<a href="${pageContext.request.contextPath}/Manager/approveCompensationClaim">
Approve Compensation Claim
</a>

<br>

</body>
</html>