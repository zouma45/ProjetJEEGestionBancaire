package dao;

import java.util.ArrayList;
import java.util.List;

import beans.client.Client;
import beans.produits.Produit;

public interface ClientDAO extends GenericDao<Client, Integer> {

	boolean ajouter(Client c);

	boolean modifier(Client c);

	boolean supprimer(Client c);

	Client retourner(Integer key);

	ArrayList<Client> listeClient();

}
