package dao;

import java.util.List;

import beans.entete_facture.EnteteFacture;

public class EnteteFactureDAOImpl extends GenericDaoHibernateImpl<EnteteFacture, Integer> implements EnteteFactureDAO {

	@Override
	public void ajouterEnteteFacture(EnteteFacture enteteFacture) {
		super.add(enteteFacture);

	}

	@Override
	public void modifierEnteteFacture(EnteteFacture enteteFacture) {
		super.update(enteteFacture);

	}

	@Override
	public void supprimerEnteteFacture(EnteteFacture enteteFacture) {
		super.remove(enteteFacture);

	}

	@Override
	public EnteteFacture findEnteteFactureByID(Integer id) {

		return super.find(id);
	}

	@Override
	public List<EnteteFacture> findAllEnteteFacture() {

		return super.getAll();
	}

}
