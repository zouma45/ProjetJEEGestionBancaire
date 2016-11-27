package beans.categorie;

import java.util.List;

import beans.GenericServicesImpl;
import dao.CategorieDaoImpl;




public class CategorieServicesImpl extends GenericServicesImpl<Categorie, Integer>  implements CategorieServices{
	
	CategorieDaoImpl categorieDao;
	
	@Override
	public void add(Categorie entity) {
		categorieDao.add(entity);
		
	}

	@Override
	public void update(Categorie entity) {
		categorieDao.update(entity);
		
	}

	@Override
	public void remove(Categorie entity) {
		categorieDao.remove(entity);
		
	}

	@Override
	public List<Categorie> show() {
		
		return categorieDao.getAll();
	}

	@Override
	public Categorie getById(int id) {
		// TODO Auto-generated method stub
		return categorieDao.find(id);
	}





	


}
