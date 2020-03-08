<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>CategoryList</h1>
	<table>
		<tr>
			<th>S.No</th>
			<th>CategoryName</th>
			<th>Description</th>
		</tr>
		<tr>
			<td>${category.id}</td>
			<td>${category.categoryName}</td>
			<td>${category.description}</td>
		</tr>
	</table>
</body>
</html>