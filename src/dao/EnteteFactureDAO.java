package dao;

import java.util.List;

import beans.entete_facture.EnteteFacture;

public interface EnteteFactureDAO extends GenericDao<EnteteFacture, Integer> {

	public void ajouterEnteteFacture(EnteteFacture enteteFacture);

	public void modifierEnteteFacture(EnteteFacture enteteFacture);

	public void supprimerEnteteFacture(EnteteFacture enteteFacture);

	public EnteteFacture findEnteteFactureByID(Integer id);

	public List<EnteteFacture> findAllEnteteFacture();

}
