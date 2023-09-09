<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Product</title>
</head>
<body>
	<h1>LIST PRODUCT</h1>
	<button ><a href="add">Add Product</a></button>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Price</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.code}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
					<td><a href="view?code=${product.code}">view</a></td>
					<td><a href="update?code=${product.code}">edit</a></td>
					<td><a href="delete?code=${product.code}">delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>