<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SSAAC</title>
</head>
<body>
<h2>SSAAC - Cadastrar Evento</h2>
<%
	String msg = request.getParameter("msg");
	if (msg!=null && !msg.isEmpty()) {
		out.println("<h3 style=\"color:red\">"+msg+"</h3>");
	}
%>

<h3>Preencha as informações solicitadas:</h3>
<form action="/SSAAC/addEvent" method="post">
<p>Nome: <input type="text" name="name"/><p/>
<p>Início: <input type="text" name="datebegin"/><p/>
<p>Término: <input type="text" name="dateend"/><p/>

<input id="botao" type="submit" value="Cadastrar">
</form>
</body>
</html>