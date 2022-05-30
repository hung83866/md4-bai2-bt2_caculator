
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<h1>Caculator</h1>
<form method="post" action="/home">
    <input type="text" name="number1" placeholder="number 1">
    <input type="text" name="number2" placeholder="number 2">
    <button name="aaa" value="Addtion">Addtion(+)</button>
    <button name="aaa" value="Subtraction">Subtraction(-)</button>
    <button name="aaa" value="Multiplication">Multiplication(x)</button>
    <button name="aaa" value="Divistion">Divistion(/)</button>
</form>
<h1>Result : ${result}</h1>
<h1>${mes}</h1>
</body>
</html>
