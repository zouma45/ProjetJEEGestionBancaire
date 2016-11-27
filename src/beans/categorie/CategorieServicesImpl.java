package beans.categorie;

import java.util.List;

import beans.GenericServicesImpl;
import dao.CategorieDaoImpl;




public class CategorieServicesImpl extends GenericServicesImpl<Categorie, Integer>  implements CategorieServices{
	
	CategorieDaoImpl categorieDao;
	public CategorieServicesImpl(){
		categorieDao=new CategorieDaoImpl();
	}
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
		return categorieDao.find(id);
	}





	


}
