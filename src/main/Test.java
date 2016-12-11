package main;


import java.util.ArrayList;
import java.util.List;


import beans.categorie.Categorie;
import beans.categorie.CategorieServicesImpl;
import beans.client.Client;
import beans.client.ClientServicesImpl;
import beans.entete_facture.EnteteFacture;
import beans.entete_facture.EnteteFactureServicesImpl;
import beans.ligne_facture.LigneFacture;
import beans.ligne_facture.LigneFactureServicesImpl;
import beans.produits.Produit;
import beans.produits.ProduitServicesImpl;
import util.HibernateUtil;


public class Test {

	public static void main(String[] args) {

		//HibernateUtil hb = new HibernateUtil();
		Client c1=new Client("mahdi", "zouch");
		ClientServicesImpl clt = new ClientServicesImpl() ; 
		clt.add(c1);
		
		Categorie cat=new Categorie("c2");
		CategorieServicesImpl ctg = new CategorieServicesImpl() ; 
		ctg.add(cat);
		
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
	    
	

		
		
		
		EnteteFacture e1=new EnteteFacture("knbjknb",c1);
		EnteteFactureServicesImpl ent = new EnteteFactureServicesImpl() ; 
		ent.add(e1);
		
		
		
		
		
		LigneFacture l1=new LigneFacture(e1);
		LigneFactureServicesImpl lf1 = new LigneFactureServicesImpl() ; 
		System.out.println("tabban");
		lf1.add(l1);
		
		
		
		LigneFacture l2=new LigneFacture(e1);
		LigneFactureServicesImpl lf2 = new LigneFactureServicesImpl() ; 
		lf2.add(l2);
		
		
		

		
		
		Produit p1=new Produit("mplk,", "plkjn",2458,sqlDate,27, cat , l1 );
		ProduitServicesImpl pr = new ProduitServicesImpl() ; 
		p1.setCategorie(cat);
		
		pr.add(p1);
		
		Produit p2=new Produit("mplk,", "plkjn",2458,sqlDate,27, cat , l2 );
		ProduitServicesImpl pr2 = new ProduitServicesImpl() ; 
		p2.setCategorie(cat);
		
		pr2.add(p2);
		
	

	}

}
