package dao;

import java.util.ArrayList;

import beans.produits.Produit;

public class ProduitDaoImpl extends GenericDaoHibernateImpl<Produit, Integer> implements ProduitDao {

	@Override
	public boolean ajouter(Produit p) {
		try {
			super.add(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

	}

	@Override
	public boolean modifier(Produit p) {
		try {
			super.update(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean supprimer(Produit p) {
		try {
			super.remove(p);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Produit retourner(Integer key) {
		return (Produit) super.find(key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Produit> listeProduit() {
		currentSession().beginTransaction();
		return (ArrayList<Produit>) super.currentSession().createQuery("from Produit").list();
	}

}
