package beans.ligne_facture;

import beans.entete_facture.EnteteFacture;
import beans.produits.Produit;

public class LigneFacture {

	private int id;

	private EnteteFacture enteteFacture;

	private Produit produit;

	public LigneFacture() {
		super();
	}

	public LigneFacture(EnteteFacture enteteFacture, Produit produit) {
		super();
		this.enteteFacture = enteteFacture;
		this.produit = produit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EnteteFacture getEnteteFacture() {
		return enteteFacture;
	}

	public void setEnteteFacture(EnteteFacture enteteFacture) {
		this.enteteFacture = enteteFacture;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

}
