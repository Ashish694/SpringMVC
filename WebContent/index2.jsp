<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">

</head>
<body>
	<form action="./test" method="post">
	<table cellpadding="px" cellspacing="5px">
	<tr>
		<td>Enter Name</td>
		<td><input type="text" name="name"/></td>
		
	</tr>
	
	<tr>
		<td colspan="2">
		<input type="submit" value="SUBMIT" class="btn btn-success"/>
		</td>
	</tr>
	</table>
	<h1>${msg}</h1>
</form>
</body>
</html>