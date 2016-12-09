package beans.produits;

import java.util.List;

import beans.GenericServicesImpl;

import dao.ProduitDaoImpl;



public class ProduitServicesImpl extends GenericServicesImpl<Produit, Integer> implements ProduitServices {


	ProduitDaoImpl produitDao;
	public ProduitServicesImpl(){
		produitDao=new ProduitDaoImpl();
	}

	@Override
	public void add(Produit produit) {
		produitDao.add(produit);
		
	}

	@Override
	public void remove(Produit produit) {
		produitDao.remove(produit);
		
	}

	@Override
	public void update(Produit produit) {
		produitDao.update(produit);
		
	}

	@Override
	public List<Produit> show() {
		
		return produitDao.getAll();
	}


	@Override
	public Produit getById(int id) {
		
		return produitDao.retourner(id) ;
	}

	

}
