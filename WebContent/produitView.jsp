<%@page import="beans.produits.Produit"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>

	<form action="EntryServlet" method="post">
		Nom Produit: <input type="text" name="nom"> <br>
				Description: <input type="text" name="description"><br>
						prix: <input type="text" name="prix"><br>
								Quantite: <input type="text" name="quantite"><br>
										Categorie: <input type="checkbox" name="categorie"><br><input
						type="submit">
	</form>



	<h1>Les produits </h1>


	<%
		List<Produit> produits = (List<Produit>) session.getAttribute("produits");
		out.print(produits);
	%>
 
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
							href='<c:url value="CompteServlet?compteIdSup=${p.id}"/>'>Supprimer</a></td>
						<td><a
							href='<c:url value="CompteBancaireServlet?compteIdModif=${p.id}"/>'>Modifier</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table> 