<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src ="https://code.jquery.com/jquery-3.7.0.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.min.js" integrity="sha512-pHVGpX7F/27yZ0ISY+VVjyULApbDlD0/X0rgGbTqCE7WFW5MezNTWG/dnhtbBuICzsd0WQPgpE4REBLv+UqChw==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.16/jquery.mask.js" integrity="sha512-0XDfGxFliYJPFrideYOoxdgNIvrwGTLnmK20xZbCAvPfLGQMzHUsaqZK8ZoH+luXGRxTrS46+Aq400nCnAT0/w==" crossorigin="anonymous" referrerpolicy="no-referrer"></script>
</head>
<body>

	<main>
		<form action="inserir.jsp" method = "post">
			<label>Nome</label> <br>
			<input type = "text" placeholder = "Digite o seu nome" name = "nome" required> <br>
			<label>Cpf</label> <br>
			<input type = "text" placeholder = "Digite o seu cpf" name ="cpf" maxlength = "14" min ="14" required id = "cpf"> <br>
			<label>Telefone</label> <br>
			<input type = "tel" placeholder = "Digite o seu telefone" name = "phone" required id = "telefone"> <br>
			<label>Email</label> <br>
			<input type = "email" placeholder = "Digite o seu email" name = "email" required> <br>
			<button type = "submit">Cadastrar</button>
	
		</form>
	
	</main>
	
	<script type="text/javascript">
	 $('#cpf').mask('000.000.000-00', {reverse: true});
	 $('#telefone').mask('(00) 0000-00000');
	</script>

</body>
</html>