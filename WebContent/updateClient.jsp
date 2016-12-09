<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="beans.client.Client"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="${pageContext.request.contextPath}/css/bootstrap.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
		Client client = (Client) session.getAttribute("client");
	%>
<title>Insert title here</title>
</head>
<body>
<center><h3><label for="titre">Ajouter Client</label></h3></center>
	<form action="ClientServ" method="post">
	 <div class="form-group">
    <label for="exampleInputEmail1">Nom Client: </label>
    <input type="text" class="form-control" id="mnom"  name="mnom" value=<%=client.getNom()  %>/>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Adresse: </label>
    <input type="text" class="form-control" id="mexampleInputPassword1" name="madresse" value=<%=client.getAdresse()  %>/>
  </div>
  <input type="hidden" name="idClient" value=<%=client.getId() %>>
  <button type="submit" class="btn btn-default">Submit</button>
	</form>

</body>
</html>