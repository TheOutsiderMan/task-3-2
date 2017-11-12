<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Результат:</h1>
	<c:choose>
		<c:when test="${requestScope.match == false}">
			<h2>Совпадений нет</h2>
			<a href="index.jsp">Попробовать еще раз</a>
		</c:when>
		<c:otherwise>
			<table border="1">
				<tr>
					<th>Name</th>
					<th>Surname</th>
					<th>Phone Number</th>
					<th>Email</th>
				</tr>
				<c:forEach items="${requestScope.persons}" var="person">
					<tr>
						<td><c:out value="${person.name}" /></td>
						<td><c:out value="${person.surname}" /></td>
						<td><c:out value="${person.phoneNumber}" /></td>
						<td><c:out value="${person.email}" /></td>
					</tr>
				</c:forEach>
			</table>
			<a href="index.jsp">Попробовать еще раз</a>
		</c:otherwise>
	</c:choose>
</body>
</html>