<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%@ page session="false"%>
<html>
<head>
<title>userForm Saved Successfully</title>
</head>
<body>
	<h3>userForm Saved Successfully.</h3>
	<strong>userForm Name:${userForm.name}</strong>
	<br>
	<strong>userForm Email:${userForm.email}</strong>
	<br>
	<strong>userForm Age:${userForm.age}</strong>
	<br>
	<strong>userForm Gender:${userForm.gender}</strong>
	<br>
	<strong>userForm Phone:${userForm.phone}</strong>
	<br>
	<strong>userForm Birthday:<fmt:formatDate
			value="${userForm.birthOfYear}" type="date" /></strong>
	<br>

</body>
</html>