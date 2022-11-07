<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="FormCalcolo" method="post">
<label>Primo Valore</label>
<input name="valore1" required=true/>
<label>Secondo Valore</label>
<input name="valore2" required=true/>
<input type="submit" value=calcolo>

</form>
</body>
</html>