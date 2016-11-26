package beans.produits;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Produit {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "titre")
	private String titre;

	@Column(name = "description")
	private int description;

	@Column(name = "prix")
	private double prix;
	@Column(name = "date")
	private Date date;
	@Column(name = "quantite")
	private int quantite;



	public Produit() {
		super();
	}

	public Produit(String titre, int description, double prix, Date date, int quantite) {
		super();
		this.titre = titre;
		this.description = description;
		this.prix = prix;
		this.date = date;
		this.quantite = quantite;
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

	public int getDescription() {
		return description;
	}

	public void setDescription(int description) {
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

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
