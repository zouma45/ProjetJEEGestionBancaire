package dao;

import java.util.ArrayList;

import beans.entete_facture.EnteteFacture;

public class EnteteFactureDAOImpl extends GenericDaoHibernateImpl<EnteteFacture, Integer> implements EnteteFactureDAO {

	@Override
	public boolean ajouter(EnteteFacture categ) {
		try {
			super.add(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean modifier(EnteteFacture categ) {
		try {
			super.update(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean supprimer(EnteteFacture categ) {
		try {
			super.remove(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public EnteteFacture retourner(Integer key) {
		return (EnteteFacture) super.find(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<EnteteFacture> listeEnteteFacture() {
		currentSession().beginTransaction();
		return (ArrayList<EnteteFacture>) super.currentSession().createQuery("from Categorie").list();
	}

}
