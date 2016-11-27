package beans.categorie;

import java.util.List;

import beans.GenericService;



public interface CategorieServices extends GenericService<Categorie, Integer>{

	public void add(Categorie categorie);

	public void remove(Categorie categorie);

	void update(Categorie categorie);

	List<Categorie> show();

	Categorie getById(int id);
	
	


}
