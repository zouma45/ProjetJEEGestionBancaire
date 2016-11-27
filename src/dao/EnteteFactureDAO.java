package dao;

import java.util.List;

import beans.entete_facture.EnteteFacture;

public interface EnteteFactureDAO extends GenericDAO<EnteteFacture, Integer> {

	public void ajouterEnteteFacture(EnteteFacture enteteFacture);

	public void modifierEnteteFacture(EnteteFacture enteteFacture);

	public void supprimerEnteteFacture(EnteteFacture enteteFacture);

	public EnteteFacture findEnteteFactureByID(Class clazz, Integer id);

	public List<EnteteFacture> findAllEnteteFacture(Class clazz);

}
