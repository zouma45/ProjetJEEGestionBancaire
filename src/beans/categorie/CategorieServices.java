package beans.categorie;

import java.util.List;

public interface CategorieServices {

	public void addCategory(Categorie categorie);

	public void removeCategory(int id);

	void updateCategory(Categorie categorie, int id);

	List<Categorie> showCategories();

	Categorie getCategoryById(int id);
	
	Categorie getCategoryByName(String name);

}
