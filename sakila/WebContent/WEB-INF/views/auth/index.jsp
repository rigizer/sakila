<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>index.jsp</title>
		
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
		
		<style>
			body {
				margin: 0;
			}
			
			.container {
				margin: 0 auto 0 auto;
				max-width: 1000px;
			}
			
			section .container {
				display: flex;
				flex-flow: column;
			}
			
			main {
				padding: 20px 10px 20px 10px;
				max-width: 760px;
			}
			
			.sidebar {
				padding: 20px 10px 20px 10px;
				background: #E0E0E0;
			}
						
			@media only screen and (min-width: 768px) {
				section .container {
					flex-flow: row;
				}
				.sidebar {
					flex: 0 1 240px;
					min-width: 240px;
					min-height: 960px;
				}
				main {
					flex: 1 0 auto;
					padding-left: 30px;
				}
			}
		</style>
	</head>
	<body>
		<section>
			<div class="container">
				<aside class="sidebar">
					<div style="padding-left: 10px; padding-right: 10px;">
						<div style="margin: auto; text-align: center;">
							<h3>Sakila Movie</h3>
						</div>
						
						<br>
						
						<div style="margin: auto;">
							<table style="width: 100%; margin: auto; text-align: right;">
								<tr>
									<td rowspan="2" style="text-align: left;">
										<i class="fas fa-user-circle fa-3x"></i>
									</td>
									<td>
										<span>${loginStaff.storeId}</span> 지점
									</td>
								</tr>
								<tr>
									<td>
										<span>${loginStaff.username}</span> 관리자님
									</td>
								</tr>
							</table>
						</div>
						
						<div style="margin-top: 10px; margin-bottom: 100px;">
							<button type="button" class="btn btn-dark btn-sm btn-block" onclick="location.href='${pageContext.request.contextPath}/auth/LogoutServlet'">Log-out</button>
						</div>
					
						<div style="margin-bottom: 20px;">
							<h4>Menu</h4>
						</div>
						
						<table width="100%">
							<tr>
								<td>홈</td>
							</tr>
							<tr>
								<td><hr width="100%" /></td>
							</tr>
							<tr>
								<td>영화반납</td>
							</tr>
							<tr>
								<td><hr width="100%" /></td>
							</tr>
							<tr>
								<td>회원목록 관리</td>
							</tr>
							<tr>
								<td>영화목록 관리</td>
							</tr>
							<tr>
								<td>영화재고 관리</td>
							</tr>
							<tr>
								<td>영화배우 관리</td>
							</tr>
							<tr>
								<td>영화 출연배우 등록</td>
							</tr>
							<tr>
								<td><hr width="100%" /></td>
							</tr>
							<tr>
								<td>매장통계</td>
							</tr>
							<tr>
								<td>MVP</td>
							</tr>
						</table>
					</div>
				</aside>
				<main>
					<h1>Index</h1>
		
					<hr>
					
					<div>
						Sakila 프로젝트 설명
						<br><br>
						따뜻한 봄바람을 불어 보내는 것은 청춘의 끓는 피다 청춘의 피가 뜨거운지라 인간의 동산에는 사랑의 풀이 돋고 이상의 꽃이 피고 희망의 놀이 뜨고 열락의 새가 운다사랑의 풀이 없으면 인간은 사막이다 오아이스도 없는 사막이다 보이는 끝까지 찾아다녀도 목숨이 있는 때까지 방황하여도 보이는 것은 거친 모래뿐일 것이다 이상의 꽃이 없으면 쓸쓸한 인간에 남는 것은 영락과 부패 뿐이다 낙원을 장식하는 천자만홍이 어디 있으며 인생을 풍부하게 하는 온갖 과실이 어디 있으랴? 이상! 우리의 청춘이 가장 많이 품고 있는 이상! 이것이야말로 무한한 가치를 가진 것이다 사람은 크고 작고 간에 이상이 있음으로써 용감하고 굳세게 살
						<br><br>
						곧 만천하의 대중을 품에 안고 그들에게 밝은 길을 찾아 주며 그들을 행복스럽고 평화스러운 곳으로 인도하겠다는 커다란 이상을 품었기 때문이다 그러므로 그들은 길지 아니한 목숨을 사는가 싶이 살았으며 그들의 그림자는 천고에 사라지지 않는 것이다 이것은 현저하게 일월과 같은 예가 되려니와 그와 같지 못하다 할지라도 창공에 반짝이는 뭇 별과 같이 산야에 피어나는 군영과 같이 이상은 실로 인간의 부패를 방지하는 소금이라 할지니 인생에 가치를 주는 원질이 되는 것이다 그들은 앞이 긴지라 착목한는 곳이 원대하고 그들은 피가 더운지라 실현에 대한 자신과 용기가 있다 그러므로 그들은 이상의 보배를 능히 품으며
						<br><br>
						예가 되려니와 그와 같지 못하다 할지라도 창공에 반짝이는 뭇 별과 같이 산야에 피어나는 군영과 같이 이상은 실로 인간의 부패를 방지하는 소금이라 할지니 인생에 가치를 주는 원질이 되는 것이다 그들은 앞이 긴지라 착목한는 곳이 원대하고 그들은 피가 더운지라 실현에 대한 자신과 용기가 있다 그러므로 그들은 이상의 보배를 능히 품으며 그들의 이상은 아름답고 소담스러운 열매를 맺어 우리 인생을 풍부하게 하는 것이다 보라 청춘을 ! 그들의 몸이 얼마나 튼튼하며 그들의 피부가 얼마나 생생하며 그들의 눈에 무엇이 타오르고 있는가? 우리 눈이 그것을 보는 때에 우리의 귀는 생의 찬미를 듣는다 그것은 웅대한 관현악이며 미묘한 교향악이다 뼈 끝에 스며들어 가는 열락의 소리다이것은 피어나기 전인 유소년에게서 구하지 못할 바이며 시들어 가는 노년에게서 구하지 못할 바이며 오직 우리 청춘에서만 구할 수 있는 것이다 청춘은 인생의 황금시대다 우리는 이 황금시대의 가치를 충분히 발휘하기 위하여
					</div>
				</main>
			</div>
		</section>
	</body>
</html>