<%@page import="beans.produits.Produit"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>


	<%
		Produit p = (Produit) session.getAttribute("produit");
		out.print(p);
	%>



	<form action="ProduitServlet" method="post">
		<input type="hidden" name="idProd" value="<%=p.getId()%>">

		<div class="form-group">
			<label for="nom">Nom Produit: </label> <input type="text"
				class="form-control" name="nom" value="<%=p.getTitre()%>">
		</div>
		<div class="form-group">
			<label for="nom">Description </label> <input type="text"
				class="form-control" name="description"
				value="<%=p.getDescription()%>">
		</div>

		<div class="form-group">
			<label for="nom">Prix </label> <input type="text"
				class="form-control" name="prix" value="<%=p.getPrix()%>">
		</div>

		<div class="form-group">
			<label for="nom">Quantite</label> <input type="text"
				class="form-control" name="quantite" value="<%=p.getQuantite()%>">
		</div>

		<div class="form-group">
			<label for="nom">Categorie</label> <select name="idCateg">
				<c:if test="${not empty cats}">
					<c:forEach items="${cats}" var="c">
						<option value="${c.idCateg}">${c.labelle}</option>

					</c:forEach>
				</c:if>
			</select>
		</div>

		<input type="submit">
	</form>

</body>
