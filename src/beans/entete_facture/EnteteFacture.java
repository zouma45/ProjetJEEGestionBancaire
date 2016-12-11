package beans.entete_facture;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import beans.client.Client;
import beans.ligne_facture.LigneFacture;
import beans.produits.Produit;

@Entity
public class EnteteFacture {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "data")
	private String data;


	
	
	@ManyToOne
	@JoinColumn(name="idClient")
	    private Client client ;
		
	 	@OneToMany(mappedBy="enteteFacture")
		private List<LigneFacture> ligneFactures;
	

	public EnteteFacture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnteteFacture(String data, Client client,List<LigneFacture> ligneFactures) {
		super();
		this.data = data;
		this.client = client;
		this.ligneFactures=ligneFactures ;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		data = data;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

}
