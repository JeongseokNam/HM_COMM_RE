<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>휴먼커뮤니티</title>
<link href="resources/css/custom/SignForm.css" rel="stylesheet">
</head>
<body>
	<div>
		<div class="div-form">
			<div class="title">
				<h3>
					<span>Human</span> <span>Academy</span> <span>Community</span>
				</h3>
			</div>
			<div>
				<form action="login" id="login" method="POST">
					<div class="div-input">
						<input class="login-input" name="id" type="text"
							placeholder="Please enter ID"> <input class="login-input"
							name="pwd" type="password" placeholder="Please enter PWD">
					</div>
					<button class="FromButton" type="submit">Sign in</button>
					<button class="FromButton" type="button"
						onclick="location.href='SignUpForm'">Sign up</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>