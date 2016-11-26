package beans.categorie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import beans.produits.Produit;

public class Categorie {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "labelle")
	private String labelle;
	
	@OneToMany(mappedBy = "produit")
	private List<Produit> associations = new ArrayList<Produit>();

	public Categorie() {
		super();
	}

	public Categorie(String labelle) {
		super();
		this.labelle = labelle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabelle() {
		return labelle;
	}

	public void setLabelle(String labelle) {
		this.labelle = labelle;
	}

}