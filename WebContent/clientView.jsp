<%@page import="beans.client.Client"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<head>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center><h3><label for="titre">Ajouter Client</label></h3></center>
	<form action="ClientServ" method="post">
	 <div class="form-group">
    <label for="exampleInputEmail1">Nom Client: </label>
    <input type="text" class="form-control" id="nom" placeholder="Nom" name="nom" >
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Adresse: </label>
    <input type="adresse" class="form-control" id="exampleInputPassword1" placeholder="Adresse" name="adresse" >
  </div>
  
  <button type="submit" class="btn btn-default">Submit</button>
	</form>



	<center><h3><label for="titre">Les Clients</label></h3></center>



	<%
		List<Client> clients = (List<Client>) session.getAttribute("clients");
	%>
 
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nom Client</th>
				<th>Adresse</th>
		
				<th colspan="2">Action</th>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty clients}">
				<c:forEach items="${clients}" var="p">
					<tr>
						<td><c:out value="${p.id}" /></td>
						<td><c:out value="${p.nom} " /></td>
						<td><c:out value="${p.adresse} " /></td>
					

						<td><a
							href='<c:url value="ClientServ?compteIdSup=${p.id}"/>'>Supprimer</a></td>
						<td><a
							href='<c:url value="ClientServ?compteIdModif=${p.id}"/>'>Modifier</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table> 