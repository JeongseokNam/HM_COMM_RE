<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link href="resources/css/custom/SignForm.css?ver=1" rel="stylesheet">
</head>
<body>
	<div>
		<div class="div-form">
			<div>
				<form action="signUp" id="signUp" method="post">
					<div class="div-input">
						<input class="signup-input" type="text" placeholder="ID" name="id">
						<input class="signup-input" type="password" placeholder="PW" name="pwd">
						<input class="signup-input" type="text" placeholder="Name" name="name"> 
					</div>
					<div class="FromButton">
						<button class="FromButton" type="submit">Sign up</button>
						<button class="FromButton" type="button">Back</button>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>