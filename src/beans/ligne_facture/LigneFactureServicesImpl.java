package beans.ligne_facture;

import beans.GenericServicesImpl;
import dao.ProduitDaoImpl;


public class LigneFactureServicesImpl extends GenericServicesImpl<LigneFacture, Integer> implements LigneFactureServices{

	ProduitDaoImpl ligneFactureDao;
	public LigneFactureServicesImpl(){
		//ligneFactureDao=new LigneFactureDaoImpl();
	}

	@Override
	public void add(LigneFacture ligneFacture) {
		//ligneFactureDao.add(ligneFacture);
	}

	@Override
	public void remove(LigneFacture ligneFacture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(LigneFacture ligneFacture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LigneFacture getById(int id) {
		
		return null;
	}

}
