<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Category</h2>
	<f:form action="home" method="post" modelAttribute="category">
		<f:input type="text" path="categoryName" placeholder="Enter category Name"/> <br> <br> 
		<f:input type="text" path="description" name="description" placeholder="Enter description " /> <br> <br>
		<f:button type="submit" id="register">Create Category</f:button>
	</f:form>
</body>
</html>