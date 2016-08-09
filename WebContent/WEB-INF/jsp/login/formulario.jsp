<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	
	<link type="text/css" href="../css/style.css" rel="stylesheet"/>
</head>
<body>
	<div class="header">
		<h1>Formulario de Controle de Acesso</h1>
	</div>
	
	<div class="form">
		<form action="autentica">
			Login: <input type="text" name="usuario.login" autocomplete="off" /><br>
			Senha: <input type="password" name="usuario.senha" /><br>
			<input type="submit" value="Enviar">
		</form>
	</div>
	
	<div class="rodape">
		<%@include file="../rodape.jsp" %>
	</div>
</body>
</html>