package dao;

import java.util.List;

import beans.client.Client;

public class ClientDAOImpl extends GenericDaoHibernateImpl<Client, Integer> implements ClientDAO {

	@Override
	public void ajouterClient(Client client) {
		super.add(client);

	}

	@Override
	public void modifierClient(Client client) {
		super.update(client);

	}

	@Override
	public void supprimerClient(Client client) {
		super.remove(client);

	}

	@Override
	public Client findClientByID(Integer id) {
		return super.find(id);
	}

	@Override
	public List<Client> findAllClient() {

		return super.getAll();
	}

}
