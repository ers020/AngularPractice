<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Inventory Management</title>
</head>
<body>
	<div class="container">
		<form action="createItem.do" method="post">
			<table>
				<tr>
					<td>
						Item Name:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input value="name" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						Description:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input value="description" class="form-control" />
					</td>
				</tr>
				<tr>
					<td>
						Price:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input value="price" class="form-control" />
					</td>
				</tr>
				<tr>
					<td>
						Category:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<select class="form-control" name="category">
							<c:forEach var="category" items="${categories}" >
								<option value="${category.id}"><c:out value="${category.category}"/></option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>
						&nbsp;
					</td>
					<td>
						<input type="submit" class="btn btn-primary" value="Add Item"/>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>