<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Product List</h1>
	
	<table>
	    <tr>
	        <th>ID</th>
	        <th>Name</th>
	        <th>Price</th>
	    </tr>
	
	    <c:forEach var="product" items="${products}">
	        <tr>
	            <td>${products.id}</td>
	            <td>${products.name}</td>
	            <td>${products.price}</td>
	            
	        </tr>
	    </c:forEach>
	</table>
</body>
</html>