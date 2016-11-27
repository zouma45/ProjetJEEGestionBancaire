package dao;

import java.util.ArrayList;

import beans.entete_facture.EnteteFacture;

public interface EnteteFactureDAO extends GenericDao<EnteteFacture, Integer> {

	boolean ajouter(EnteteFacture enteteFacture);

	boolean modifier(EnteteFacture enteteFacture);

	boolean supprimer(EnteteFacture enteteFacture);

	EnteteFacture retourner(Integer key);

	ArrayList<EnteteFacture> listeEnteteFacture();

}
