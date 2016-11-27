package dao;

import java.util.ArrayList;

import beans.produits.Produit;



public interface ProduitDao extends GenericDao<Produit, Integer> {
	boolean ajouter(Produit p);

	boolean modifier(Produit p);

	boolean supprimer(Produit p);

	Produit retourner(Integer key);

	ArrayList<Produit> listeProduit();

}
