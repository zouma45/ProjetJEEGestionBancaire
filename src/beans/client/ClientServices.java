package beans.client;

import java.util.List;

public interface ClientServices {
	public void addClient(Client client);

	public void removeClient(int id);

	void updateClient(Client client, int id);

	List<Client> showClients();

	Client getClientById(int id);

	Client getClientByName(String name);

}
