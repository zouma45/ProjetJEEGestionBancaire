package beans.produits;

import java.util.List;

import beans.GenericService;
import beans.categorie.Categorie;

public interface ProduitServices extends GenericService<Produit, Integer>{
	
	
	public void add(Produit produit);

	public void remove(Produit produit);

	void update(Produit categorie);

	List<Produit> show();

	Produit getById(int id);
	

}
