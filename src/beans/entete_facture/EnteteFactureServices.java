package beans.entete_facture;

import java.util.List;

import beans.GenericService;

public interface EnteteFactureServices extends GenericService<EnteteFacture, Integer> {

	public void add(EnteteFacture enteteFacture);

	public void remove(EnteteFacture enteteFacture);

	void update(EnteteFacture enteteFacture);

	List<EnteteFacture> show();

	EnteteFacture getById(int id);

}
