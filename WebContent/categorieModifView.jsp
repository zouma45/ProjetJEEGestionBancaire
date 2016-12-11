<%@page import="beans.categorie.Categorie"%>
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
		Categorie c = (Categorie) session.getAttribute("categorie");

	%>



	<form action="CategorieServlet" method="post">
		<input type="hidden" name="midCateg" value="<%= c.getIdCateg()%>">

		<div class="form-group">
			<label for="nom">Nom Categorie: </label> <input type="text"
				class="form-control" name="mnom" value="<%=c.getLabelle()%>">
		</div>
		

		<input type="submit">
	</form>

</body>

