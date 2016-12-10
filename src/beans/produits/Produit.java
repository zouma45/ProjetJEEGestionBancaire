package beans.produits;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import beans.categorie.Categorie;
import beans.ligne_facture.LigneFacture;

@Entity
public class Produit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "titre")
	private String titre;

	@Column(name = "description")
	private String description;

	@Column(name = "prix")
	private double prix;
	@Column(name = "date")
	private Date date;
	@Column(name = "quantite")
	private int quantite;
	
	@ManyToOne
	@JoinColumn(name="idCateg")
	private Categorie categorie ;
	
	@ManyToOne
	@JoinColumn(name="idLigne")
	private LigneFacture ligneFacture ;


	public Produit() {
		super();
	}

	public Produit(String titre, String description, double prix, Date date, int quantite ,  Categorie categorie) {
		super();
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.date = date;
		this.quantite = quantite;
		this.categorie= categorie ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public LigneFacture getLigneFacture() {
		return ligneFacture;
	}

	public void setLigneFacture(LigneFacture ligneFacture) {
		this.ligneFacture = ligneFacture;
	}
	
	
}
