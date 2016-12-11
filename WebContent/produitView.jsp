<%@page import="beans.categorie.Categorie"%>
<%@page import="beans.produits.Produit"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>

	<%
		List<Produit> produits = (List<Produit>) session.getAttribute("produits");
		out.print(produits);
		List<Categorie> cats = (List<Categorie>) session.getAttribute("cats");
	%>
<body>
<center><h3><label for="titre">Ajouter Produit</label></h3></center>
	<form action="ProduitServlet" method="post">
	
	<div class="form-group">
    	<label for="nom">Nom Produit: </label>
		<input type="text" class="form-control" name="nom"> 
	</div>
	<div class="form-group">
    	<label for="nom">Description </label>	
		<input type="text" class="form-control" name="description">
	</div>
	
		<div class="form-group">
    	<label for="nom">Prix </label>
		<input type="text" class="form-control" name="prix">
		</div>
	
		<div class="form-group">
    	<label for="nom">Quantite</label>
				<input type="text" class="form-control" name="quantite">
		</div>
		
		<div class="form-group">
    	<label for="nom">Categorie</label>
										<select name="idCateg">
											<c:if test="${not empty cats}">
												<c:forEach items="${cats}" var="c">
  												<option value="${c.idCateg}">${c.labelle}</option>

  												</c:forEach>
											</c:if>
										</select>
		</div>
										
										<input type="submit">
	</form>



	<h1>Les produits </h1>



 
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nom Produit</th>
				<th>Description</th>
				<th>prix</th>
				<th>quantite</th>
				<th>Categorie</th>
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty produits}">
				<c:forEach items="${produits}" var="p">
					<tr>
						<td><c:out value="${p.id}" /></td>
						<td><c:out value="${p.titre} " /></td>
						<td><c:out value="${p.description} " /></td>
						<td><c:out value="${p.prix} " /></td>
						<td><c:out value="${p.quantite} " /></td>
						<td><c:out value="${p.categorie.idCateg} " /></td>

						<td><a
							href='<c:url value="ProduitServlet?produitIdSup=${p.id}"/>'>Supprimer</a></td>
						<td><a href='<c:url value="ProduitServlet?produitIdModif=${p.id}"/>'>Modifier</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table> 