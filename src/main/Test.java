package main;

import java.sql.Date;

import beans.categorie.Categorie;
import beans.categorie.CategorieServicesImpl;
import beans.client.Client;
import beans.client.ClientServicesImpl;
import beans.produits.Produit;
import beans.produits.ProduitServicesImpl;


public class Test {

	public static void main(String[] args) {

		//HibernateUtil hb = new HibernateUtil();
		Client c1=new Client("mahdi", "zouch");
		ClientServicesImpl clt = new ClientServicesImpl() ; 
		clt.add(c1);
		
		
		Categorie cat=new Categorie("c1");
		CategorieServicesImpl ctg = new CategorieServicesImpl() ; 
		ctg.add(cat);
		
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	    
		Produit p1=new Produit("lfd", "klokfdj",24,sqlDate,2);
		ProduitServicesImpl pr = new ProduitServicesImpl() ; 
		p1.setCategorie(cat);
		pr.add(p1);

	}

}
