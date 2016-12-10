package beans.categorie;

import java.io.Serializable;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import beans.produits.Produit;

@Entity
public class Categorie implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "idCateg")
	private int idCateg;
	
	@Column(name = "labelle")
	private String labelle;
	
	@OneToMany(mappedBy="categorie")
	private List<Produit> produits;

	public Categorie() {
		super();
	}

	public Categorie(String labelle) {
		super();
		this.labelle = labelle;
	}

	public int getIdCateg() {
		return idCateg;
	}

	public void setIdCateg(int idCateg) {
		this.idCateg = idCateg;
	}

	public String getLabelle() {
		return labelle;
	}

	public void setLabelle(String labelle) {
		this.labelle = labelle;
	}

}