<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
  <h1>Gestion Produit </h1>

</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-3">
       <form action="CategorieServlet">
      <button type="submit" class="btn btn-primary btn-lg btn-block">Gestion Categorie</button>
      </form>
    </div>
    <div class="col-sm-3">
   <form action="ProduitServlet">
 <button type="submit" class="btn btn-primary btn-lg btn-block" >Gestion Produit</button>
 </form>
    </div>
    <div class="col-sm-3">
   <form action="ClientServ">
       <button type="submit" class="btn btn-primary btn-lg btn-block">Gestion Client</button>
   </form>
    </div>
    
     <div class="col-sm-3">
       <button type="button" class="btn btn-primary btn-lg btn-block">Gestion Facture</button>
    </div>
   
  </div>
   
</div>



</body>
</html>
