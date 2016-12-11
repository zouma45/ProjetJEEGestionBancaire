<%@page import="beans.categorie.Categorie"%>
<%@page import="beans.produits.Produit"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	<title> Gestion Categorie</title>
</head>

<%
	List<Categorie> categories = (List<Categorie>) session.getAttribute("categories");

%>
<body>
	<center>
		<h3>
			<label for="titre">Ajouter Categorie</label>
		</h3>
	</center>
	<form action="CategorieServlet" method="post">

		<div class="form-group">
			<label for="nom">Nom Categorie: </label> <input type="text"
				class="form-control" name="nom">
		</div>
		

		<input type="submit">
	</form>



	<h1>Les Categories</h1>




	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nom Categorie</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty categories}">
				<c:forEach items="${categories}" var="p">
					<tr>
						<td><c:out value="${p.idCateg}" /></td>
						<td><c:out value="${p.labelle} " /></td>
						
						<td><a
							href='<c:url value="CategorieServlet?categIdSup=${p.idCateg}"/>'>Supprimer</a></td>
						<td><a
							href='<c:url value="CategorieServlet?categIdModif=${p.idCateg}"/>'>Modifier</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>