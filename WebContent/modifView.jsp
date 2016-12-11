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


	<%
		Produit p =  (Produit) session.getAttribute("produit");
		out.print(p);
	%>
	<form action="ProduitServ" method="post">
	 		<input type="hidden" name="idProd"  value="<%= p.getId() %>" >
		Nom Produit: <input type="text" name="mnom" value="<%= p.getTitre() %>" > <br>
				Description: <input type="text" name="mdescription"  value="<%= p.getDescription()%>"  ><br>
						prix: <input type="text" name="mprix"  value="<%= p.getPrix() %>"><br>
								Quantite: <input type="text" name="mquantite"  value="<%= p.getQuantite() %>"><br>
										Categorie: <input type="range" name="mcategorie"><br><input
						type="submit">
	</form>

</body>
	