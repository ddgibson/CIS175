<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>results1</title>
</head>
<body>
<p>${userCash.getYen()} Yen <br />
${userCash.getPesos()} Pesos  <br />
${userCash.getEuros()} Euros  <br />
${userCash.getCAD()} Canadian Dollars  <br />
${userCash.getGBP()} Pounds  <br />
${userCash.getAUD()} Australian Dollars  <br />
${userCash.getRupees()} Rupees  <br />
</p>
<a href="converter.jsp">Select another amount of USD</a>

</body>
</html>