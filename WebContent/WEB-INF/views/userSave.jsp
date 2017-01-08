<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form"
	prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Save Page</title>
<style>
.error {
	color: #ff0000;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
	<spring:form method="POST" commandName="userForm" action="save.htm">
		<table>
			<tr>
				<td>Name:</td>
				<td><spring:input path="name" /></td>
				<td><spring:errors path="name" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><spring:input path="email" /></td>
				<td><spring:errors path="email" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Age:</td>
				<td><spring:input path="age" /></td>
				<td><spring:errors path="age" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Gender:</td>
				<td><spring:select path="gender">
						<spring:option value="" label="Select Gender" />
						<spring:option value="MALE" label="Male" />
						<spring:option value="FEMALE" label="Female" />
						<spring:option value="OTHER" label="Other" />
					</spring:select></td>
				<td><spring:errors path="gender" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Birthday:</td>
				<td><spring:input path="birthOfYear" placeholder="dd/MM/yyyy" /></td>
				<td><spring:errors path="birthOfYear" cssClass="error" /></td>
			</tr>

			<tr>
				<td>Phone:</td>
				<td><spring:input path="phone" /></td>
				<td><spring:errors path="phone" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Save User Form"></td>
			</tr>
		</table>

	</spring:form>

</body>
</html>