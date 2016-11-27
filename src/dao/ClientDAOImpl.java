package dao;

import java.util.List;

import beans.client.Client;

public class ClientDAOImpl extends GenericDAOImpl<Client, Integer> implements ClientDAO {

	@Override
	public void ajouterClient(Client client) {
		super.ajouter(client);

	}

	@Override
	public void modifierClient(Client client) {
		super.modifier(client);

	}

	@Override
	public void supprimerClient(Client client) {
		super.supprimer(client);

	}

	@Override
	public Client findClientByID(Class clazz, Integer id) {
		return super.findByID(clazz, id);
	}

	@Override
	public List<Client> findAllClient(Class clazz) {

		return super.findAll(clazz);
	}

}
