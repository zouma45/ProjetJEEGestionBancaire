package beans.produits;

import java.util.List;

import beans.categorie.Categorie;

public interface ProduitServices {
	
	
	public void addPoduit(Produit produit);

	public void removeProduit(int id);

	void updateProduit(Produit categorie, int id);

	List<Produit> showProduits();

	Produit getProduitById(int id);
	
	Produit getProduitByName(String name);

}
