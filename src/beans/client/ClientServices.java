package beans.client;

import java.util.List;

import beans.GenericService;

public interface ClientServices extends GenericService<Client, Integer> {
	public void add(Client client);

	public void remove(Client client);

	void update(Client client);

	List<Client> show();

	Client getById(int id);

}
