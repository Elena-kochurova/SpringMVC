<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Spring mvc spplication</title>
</head>
<body>
<h3> Write your data please </h3>
<hr>
<form:form action="/swowDetails" modelAttribute="person">
    Name: <form:input path="name"/>
    <br><br>
    Surname: <form:input path="surname">
    <br><br>
    Age: <form:input path="age">
    <br><br>
    <input type="submit" value="submit">
</form:form>
</body>
</html>