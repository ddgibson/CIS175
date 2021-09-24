<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the Currency Converter!</title>
</head>
<body>
<h1>Currency Converter</h1>
<form action="getCurrency"method="post">
Enter the amount of US Dollars you want converted: 
<input type="text"name="userMoney"size="10">
<input type="submit"value="Convert Currency"/>
</form>
</body>
</html>