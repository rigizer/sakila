<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>customerList.jsp</title>
		
		<!-- Bootstrap Framework 사용 -->
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		
		<!-- Bootstrap 4 Icons -->
		<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css" integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
		
		<!-- Sakila CSS -->
		<link rel="stylesheet" type="text/css" href="/sakila/css/style.css" />
	</head>
	<body>
		<section>
			<div class="container">
				<aside class="sidebar">
					<!-- menu 항목을 include한다 -->
					<jsp:include page="/include/menu.jsp"></jsp:include>
				</aside>
				<main>
					<table width="100%" style="margin-top: 8px;">
						<tr>
							<td>
								<h2>회원 목록</h2>
							</td>
							<td width="15%">
								&nbsp;
							</td>
						</tr>
					</table>
					
					<hr style="margin-top: 8px;">
					
					<table class="table table-hover" style="text-align: center">
						<thead>
							<th>번호</th>
							<th>이름</th>
							<th>연락처</th>
							<th>활성여부</th>
							<th>연체여부</th>
						</thead>
						<tbody>
							<c:forEach var="b" items="${customerList}">
								<tr>
									<td>${b.customerId}</td>
									<td>${b.name}</td>
									<td>${b.phone}</td>
									<td>${b.notes}</td>
									<td>${b.overdue}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</main>
			</div>
		</section>
	</body>
</html>