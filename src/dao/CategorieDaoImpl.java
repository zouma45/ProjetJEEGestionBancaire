package dao;

import java.util.ArrayList;

import beans.categorie.Categorie;


public class CategorieDaoImpl extends GenericDaoHibernateImpl<Categorie, Integer> implements CategorieDao {

	@Override
	public boolean ajouter(Categorie categ) {
		try {
			super.add(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean modifier(Categorie categ) {
		try {
			super.update(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean supprimer(Categorie categ) {
		try {
			super.remove(categ);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public Categorie retourner(Integer key) {
		return (Categorie) super.find(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Categorie> listeCategorie() {
		currentSession().beginTransaction();
		return (ArrayList<Categorie>) super.currentSession().createQuery("from Categorie").list();
	}

	
}
