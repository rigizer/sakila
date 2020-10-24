<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index.jsp</title>
	</head>
	<body>
		<h1>index.jsp</h1>
		
		<div>
			<span>${loginStaff.storeId}</span> 지점 
			<span>${loginStaff.email}</span>(<span>${loginStaff.username}</span>) 관리자님, 환영합니다!
		</div>
		
		<div>
			<a href="${pageContext.request.contextPath}/auth/LogoutServlet">Log-out</a>
		</div>
	</body>
</html>