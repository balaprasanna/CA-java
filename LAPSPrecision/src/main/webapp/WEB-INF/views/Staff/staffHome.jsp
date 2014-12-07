<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Staff home
<br>
<c:url var="url" value="/Staff/submitLeaveApplication" > 
<c:param name="uid" value="${uid}"></c:param> 
</c:url> 


<a href="${url}">
Submit Leave Application
</a>

<!-- While using c url, no need to put context path, -->
<!-- while using normal href, we should put context path -->

<br>
<c:url var="url_manage" value="/Staff/manageLeaveApplication" > 
<c:param name="uid" value="${uid}"></c:param> 
</c:url> 
<a href="${url_manage}">
Manage Leave Application
</a>

<br>

<a href="${pageContext.request.contextPath}/Staff/claimLeaveCompensation">
Claim Leave Compensation
</a>

<br>

<c:url var="url_history" value="/Staff/viewPersonalLeaveHistory" > 
<c:param name="uid" value="${uid}"></c:param> 
</c:url> 

<a href="${url_history}">
View Personal Leave History
</a>

<br>

${uid}
<br>

${param['result']}

</body>
</html>