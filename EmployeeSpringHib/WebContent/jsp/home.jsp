<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Page</title>
</head>
<body>

<form:form action="store.do" modelAttribute="empObj" method="POST">
Name:<form:input path="empName"/><br><br>
Salary:<form:input path="salary"/><br><br>
<input type="submit" value="Store"/><br><br>

</form:form>
</body>
</html>