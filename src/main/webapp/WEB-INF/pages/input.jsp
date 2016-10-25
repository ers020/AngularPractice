<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet" >
<link href="<c:url value="/resources/css/bootstrap-theme.css"/>" rel="stylesheet" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Store Inventory Management</title>
</head>
<body>
	<div class="container">
		<h1>Add An Item To Database</h1>
	</div>
	<br />
	<div class="container">
		<form action="createItem.do" method="post">
			<table class="createItemTable">
				<tr>
					<td>
						Item Name:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input type="text" id="name" name="name" class="form-control"/>
					</td>
				</tr>
				<tr>
					<td>
						Description:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input type="text" id="description" name="description" class="form-control" />
					</td>
				</tr>
				<tr>
					<td>
						Price:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<input type="text" id="price" name="price" class="form-control" />
					</td>
				</tr>
				<tr>
					<td>
						Category:&nbsp;&nbsp;&nbsp;
					</td>
					<td>
						<select class="form-control" name="category">
							<option value="NONE">---Select an Option--</option>
							<c:forEach var="category" items="${categories}" >
								<option value="${category.id}">
									<c:out value="${category.category}"/>
								</option>
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