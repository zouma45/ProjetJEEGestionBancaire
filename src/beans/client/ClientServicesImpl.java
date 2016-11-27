package beans.client;

import java.util.List;

import beans.GenericServicesImpl;
import dao.ClientDAOImpl;

public class ClientServicesImpl extends GenericServicesImpl<Client, Integer> implements ClientServices {

	ClientDAOImpl clientDao;

	public ClientServicesImpl() {
		clientDao = new ClientDAOImpl();
	}

	@Override
	public void add(Client entity) {
		clientDao.add(entity);

	}

	@Override
	public void update(Client entity) {
		clientDao.update(entity);

	}

	@Override
	public void remove(Client entity) {
		clientDao.remove(entity);

	}

	@Override
	public List<Client> show() {

		return clientDao.getAll();
	}

	@Override
	public Client getById(int id) {
		return clientDao.find(id);
	}

}
