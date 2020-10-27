<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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