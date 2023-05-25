<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%@ page import = "model.Aluno , controller.AlunoDAO" %>

<%
Aluno aluno =  new Aluno();
AlunoDAO dao =  new AlunoDAO();

if(request.getParameter("nome").equals("") || request.getParameter("cpf").equals("") || request.getParameter("phone").equals("") || request.getParameter("email").equals("")){
	response.sendRedirect("index.jsp");
}else{
	aluno.setNome(request.getParameter("nome"));
	aluno.setCpf(request.getParameter("cpf"));
	aluno.setTelefone(request.getParameter("phone"));
	aluno.setEmail(request.getParameter("email"));
	dao.insert(aluno);
	response.sendRedirect("index.jsp");
}


%>

</body>
</html>