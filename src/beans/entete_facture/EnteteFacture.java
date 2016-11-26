package beans.entete_facture;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import beans.client.Client;

public class EnteteFacture {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "data")
	private String data;

	@Column(name = "idClient")
	Client client;
	
	
	 	@OneToMany(mappedBy="client")
	    private List<Client> associations = new ArrayList<Client>();
		
	 	
	

	public EnteteFacture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EnteteFacture(String data, Client client) {
		super();
		data = data;
		this.client = client;
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
