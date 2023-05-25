<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page import = "model.Aluno , controller.AlunoDAO , java.util.ArrayList" %>
	
	<table border = 5>
		<tr>
			<td>Matricula</td>
			<td>Nome</td>
			<td>Cpf</td>
			<td>Telefone</td>
			<td>Email</td>
		</tr>
		<%
			Aluno aluno = new Aluno();
			AlunoDAO dao = new AlunoDAO();
			ArrayList<Aluno> listar = dao.listarAluno();
			for(int num = 0;num<listar.size();num++){
				out.println("<tr>");
				out.println("<td>"+listar.get(num).getId_matricula()+ "</td>");
				out.println("<td>"+listar.get(num).getNome()+ "</td>");
				out.println("<td>"+listar.get(num).getCpf()+ "</td>");
				out.println("<td>"+listar.get(num).getTelefone()+ "</td>");
				out.println("<td>"+listar.get(num).getEmail()+ "</td>");
				out.println("<td><a href = 'formalterar.jsp'>Editar</a></td>");
				out.println("<td><a href = 'formdeletar.jsp'>Deletar</a></td>");
				
				out.println("</tr>");
			}
		%>	
	</table>
</body>
</html>