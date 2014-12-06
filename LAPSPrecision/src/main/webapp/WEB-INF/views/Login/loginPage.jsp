<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Login Page
</h1>

<P> Welcome to login page.</P>
<form action="${pageContext.request.contextPath}/login" method="post">
Username <input type="text" name="UID" />
<br>
Password <input type="password" name="password" />
<br>
<input type="submit" value="Login">
</form>
</body>
</html>
