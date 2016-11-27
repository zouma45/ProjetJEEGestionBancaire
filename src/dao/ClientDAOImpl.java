package dao;

import java.util.ArrayList;
import java.util.List;

import beans.categorie.Categorie;
import beans.client.Client;

public class ClientDAOImpl extends GenericDaoHibernateImpl<Client, Integer> implements ClientDAO {

	@Override
	public boolean ajouter(Client client) {
		try {
			super.add(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean modifier(Client client) {
		try {
			super.update(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean supprimer(Client client) {
		try {
			super.remove(client);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Client retourner(Integer key) {
		return (Client) super.find(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Client> listeClient() {
		currentSession().beginTransaction();
		return (ArrayList<Client>) super.currentSession().createQuery("from Client").list();
	}


}
