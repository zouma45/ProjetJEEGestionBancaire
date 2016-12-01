package beans.ligne_facture;

import java.util.List;

import beans.GenericService;
import beans.produits.Produit;

public interface LigneFactureServices extends GenericService<LigneFacture, Integer>{
	public void add(LigneFacture ligneFacture);

	public void remove(LigneFacture ligneFacture);

	void update(LigneFacture ligneFacture);

	List<LigneFacture> show();

	LigneFacture getById(int id);

}
