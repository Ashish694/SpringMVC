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
	
	<form action="./nlt" method="post" >
	<table cellpadding="5px" cellspacing="5px">
	<tr>
		<td>Enter Name</td>
		<td><input type="text" name="name" value="${nameValue}"/></td>
		
	</tr>
	<tr>
		<td>Enter Age</td>
		<td><input type="text" name="age" value="${ageValue}"/></td>
	</tr>
	<tr>
		<td>Enter Phone</td>
		<td><input type="text" name="phone" value="${phoneValue}"/></td>
	</tr>
	
	
	<tr>
		<td colspan="2">
		<input type="submit" value="SUBMIT" class="btn btn-success"/>
		</td>
	</tr>
	</table>
</form>

<h1>${msg}</h1>
<h1>${personArrayList}</h1>
</body>
</html>