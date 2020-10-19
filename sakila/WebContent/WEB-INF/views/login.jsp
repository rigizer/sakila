<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ tablib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login.jsp</title>
		
		<!-- jQuery Google CDN -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<!-- jQuery를 이용하여 로그인 E-mail/PW 검사 -->
		<script>
			$(document).ready(function() {	// 문서가 로드되면 이 스크립트를 제일 마지막에 실행해주세요
				$("#btn").click(function() {	// 버튼 클릭시 폼 내용의 유효성 검사를 수행
					if ($("#email").val().length < 1) {	// email이 1 이상이 아닌경우 수행
						alert("이메일을 입력해주세요");
						return;
					}
					else if ($("#pw").val() < 1) {		// pw가 1 이상이 아닌경우 수행
						alert("비밀번호를 입력해주세요");
						return;
					}
					$("#loginForm").submit();
				});	
			});
		</script>
	</head>
	<body>
		<h1>Login Form</h1>
		<form id="loginForm">
			<div>
				<input type="text" placeholder="E-mail" id="email">
			</div>
			<div>
				<input type="password" placeholder="PW" id="pw">
			</div>
			<div>
				<button type="button" id="btn">Log-in</button>
			</div>
		</form>
	</body>
</html>