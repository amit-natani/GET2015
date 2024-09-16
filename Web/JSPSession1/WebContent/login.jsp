<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel = "stylesheet" type = "text/css" href = "css/style2.css"/ >
<script type = "text/javascript" src = "js/script.js"></script>
</head>
<body>
	<fieldset>
		<legend> ::Login:: </legend>
		<form id = "myform" action = "LoginValidation"  method = "post">
			<label><b>Enter UserName:<span>*</span></b></label><br/>
			<input id = "username" class = "text" type = "text" name = "username" pattern = "[a-z|A-Z|0-9]*" placeholder = "Enter Username" maxlength = "14"/><br/>
			<label><b>Enter Password:<span>*</span></b></label><br/>
			<input id = "password" class = "text" type = "password" name = "password" placeholder = "Enter Password"/><br/>
			<input type = "submit" value = "Login" id = "submitbutton" onclick = "return validate()"/><br>
			<label><font color = "red">${a}</font></label>
		</form>
		<a href = "index.jsp" style = "text-decoration : none; margin-top : 20%;">New User...<b>Register</b></a>
	</fieldset>
</body>
</html>
