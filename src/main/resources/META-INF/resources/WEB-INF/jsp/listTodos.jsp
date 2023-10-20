

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>List Todos Page</title>
	</head>
	<body>
		<div>Welcome ${name}</div>
		<hr>
		<h2>Your Todos</h2>
		<table>
			<thead>
				<tr>
					<th>id</th>
					<th>Description</th>
					<th>Target Date</th>
					<th>Is Done?</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${todos}" var="todo">
					<tr>
						<td>${todo.id }</td>
						<td>${todo.description }</td>
						<td>${todo.targetDate }</td>
						<td>${todo.done }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>