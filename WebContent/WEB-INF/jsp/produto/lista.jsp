<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link type="text/css" href="../css/style.css" rel="stylesheet"/>
	
	<script type="text/javascript"
		src="<c:url value="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"/>">
	</script>	
	
	<title>Produto</title>
</head>
<body>
	<div class="header">
		<h1>Produtos</h1>
	</div>
	<table cellspacing="0" class="table">
			<tr class="cabecalho-table">
				<td>Nome</td>
				<td>Preco</td>
				<td>Descricao</td>
				<td>Inicio das Vendas</td>
				<td>Ação</td>
			</tr>
		<c:forEach var="produto" items="${produtoList}">
			<tr id="produto${produto.id}">
				<td>${produto.nome}</td>
				<td>${produto.preco}</td>
				<td>${produto.descricao}</td>
				<td><fmt:formatDate pattern="dd/MM/yyyy"
						value="${produto.dataInicioVenda.time}" /></td>
				<td id="alterar-remover">
					<span style="padding:5%">
						<a href="#" onclick="return removeProduto(${produto.id})">
							Remover
						</a>
					</span>
					<span style="padding:5%">
						<a href="<c:url value="/produto/edita"/>?id=${produto.id}">
							Alterar
						</a>
					</span>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<p id="adicionar"><a href="formulario">Adicionar</a></p>

<script type="text/javascript">
function removeProduto(id){
	$('#mensagem')
		.load('<c:url value="/produto/remove"/>?produto.id='+id);
	$('#produto' +id).remove();
}
</script>

	<div class="rodape">
		<%@include file="../rodape.jsp" %>
	</div>
</body>
</html>