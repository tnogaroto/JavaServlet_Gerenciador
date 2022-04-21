
<% String nomeEmpresa = (String)request.getAttribute("empresa");
//scriplet
System.out.println(nomeEmpresa);
%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


Empresa <% out.println(nomeEmpresa); %> cadastrada com Sucesso.


</body>
</html>