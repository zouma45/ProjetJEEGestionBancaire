package dao;

import java.util.List;

import beans.client.Client;

public interface ClientDAO extends GenericDAO<Client, Integer> {

	public void ajouterClient(Client client);

	public void modifierClient(Client client);

	public void supprimerClient(Client client);

	public Client findClientByID(Class clazz, Integer id);

	public List<Client> findAllClient(Class clazz);

}
