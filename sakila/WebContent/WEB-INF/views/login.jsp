<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>login.jsp</title>
		
		<!-- Bootstrap Framework 사용 -->
		
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		
		<!-- jQuery library -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<!-- Popper JS -->
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
		
		<!-- Latest compiled JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
		
		<!-- jQuery Google CDN -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		
		<!-- jQuery를 이용하여 로그인 E-mail/PW 검사 -->
		<script>
			$(document).ready(function() {	// 문서가 로드되면 이 스크립트를 제일 마지막에 실행해주세요
				$("#btn").click(function() {	// 버튼 클릭시 폼 내용의 유효성 검사를 수행
					if ($("#id").val() == "") {	// id가 공백인 경우 수행
						alert("아이디를 입력해주세요");
						return;
					}
					else if ($("#pw").val() == "") { // pw가 공백인 경우 수행
						alert("비밀번호를 입력해주세요");
						return;
					}
					$("#loginForm").submit();
				});	
			});
		</script>
	</head>
	<body>
		<br><br><br><br><br><br>
	
		<div class="container">
			<div class="align-self-center">
				<h1 class="text-center login-title">Sakila DVD Log-in</h1>
				
				<br>
				
				<form method="post" action="${pageContext.request.contextPath}/LoginServlet" id="loginForm">
					<table class="table table-striped" style="margin: auto; text-align: center; width: 50%;">
						<tr>
							<td>
								<div class="container">
									<input type="text" class="form-control" name="id" placeholder="Staff ID" id="id">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="container">
									<input type="password" class="form-control" name="pw" placeholder="Password" id="pw">
								</div>
							</td>
						</tr>
						<tr>
							<td>
								<div class="container">
									<button type="button" class="btn btn-primary btn-block" id="btn">Log-in</button>
								</div>
							</td>
						</tr>
					</table>
				</form>
			</div>
			
			<br>
			
			<table class="table table-striped" style="margin: auto; text-align: center; width: 50%">
				<tr>
					<td width="40%">
						<div class="container">
							Yesterday
						</div>
					</td>
					<td>
						<div class="container">
							${yesterdayStats.count}
						</div>
					</td>
				</tr>
				<tr>
					<td width="40%">
						<div class="container">
							Today
						</div>
					</td>
					<td>
						<div class="container">
							${todayStats.count}
						</div>
					</td>
				</tr>
				<tr>
					<td width="40%">
						<div class="container">
							Total
						</div>
					</td>
					<td>
						<div class="container">
							${totalCount}
						</div>
					</td>
				</tr>
			</table>
		</div>
	</body>
</html>