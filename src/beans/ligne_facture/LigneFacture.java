package beans.ligne_facture;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import beans.entete_facture.EnteteFacture;
import beans.produits.Produit;

@Entity
public class LigneFacture {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	

	
	@OneToMany(mappedBy="ligneFacture")
	private List<Produit> produits;
	
	@ManyToOne
	@JoinColumn(name="idEntete")
	private EnteteFacture enteteFacture ;

	public LigneFacture() {
		super();
	}

	public LigneFacture(List<Produit> produits) {
		super();
		this.produits=produits ;
		
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

	
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}
