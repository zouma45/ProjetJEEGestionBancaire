package dao;

import java.util.List;

import beans.entete_facture.EnteteFacture;

public class EnteteFactureDAOImpl extends GenericDAOImpl<EnteteFacture, Integer> implements EnteteFactureDAO {

	@Override
	public void ajouterEnteteFacture(EnteteFacture enteteFacture) {
		super.ajouter(enteteFacture);

	}

	@Override
	public void modifierEnteteFacture(EnteteFacture enteteFacture) {
		super.modifier(enteteFacture);

	}

	@Override
	public void supprimerEnteteFacture(EnteteFacture enteteFacture) {
		super.supprimer(enteteFacture);

	}

	@Override
	public EnteteFacture findEnteteFactureByID(Class clazz, Integer id) {

		return super.findByID(clazz, id);
	}

	@Override
	public List<EnteteFacture> findAllEnteteFacture(Class clazz) {

		return super.findAll(clazz);
	}

}
