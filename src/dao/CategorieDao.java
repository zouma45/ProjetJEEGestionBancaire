package dao;

import java.util.ArrayList;

import beans.categorie.Categorie;



public interface CategorieDao extends GenericDao<Categorie, Integer>{
	boolean ajouter(Categorie categ);
	boolean modifier(Categorie categ);
	boolean supprimer(Categorie categ);
	Categorie retourner(Integer key);
	ArrayList<Categorie> listeCategorie();
}
