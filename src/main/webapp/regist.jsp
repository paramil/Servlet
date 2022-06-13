<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<style>
	body {
		background-color: #ffefc4;
	}
	h1 {
		text-align :  center;
	}
	form {
		width : 500px;
		margin: 0 auto;
		padding: 30px;
		border : 1px solid #333;
		background-color :#fff;
	}
</style>
</head>
<body>
	<h1>회원가입하기</h1>
	<form method="post" action="reg">
		<p>아이디</p>
		<input type="text" name="userId">
		
		<p>비밀번호</p>		
		<input type="password" name="userPwd">
		
		<p>이메일</p>
		<input type="text" name="email" size="40">
		
		<p>이메일 수신여부</p>
		<input type="radio" name="emailAgree" value="yes">예
		<input type="radio" name="emailAgree" value="no">아니오
		
		<p>관심사항</p>
		<input type="checkbox" name="interest" value="movie">영화
		<input type="checkbox" name="interest" value="music">음악
		<input type="checkbox" name="interest" value="book">책
		<input type="checkbox" name="interest" value="food">음식
		
		<p>전화번호</p>
		<select name="phone_1">
			<option value="010">010
			<option vlaue="011">011
		</select>
		<input type="text" name="phone_2">
		
		<p>자기소개</p>
		<textarea name="introduce" cols="60" rows="10"></textarea>
		
		<br>
		<br>
		<br>	
		
		<input type="submit" value="확인">
		
	</form>
</body>
</html>