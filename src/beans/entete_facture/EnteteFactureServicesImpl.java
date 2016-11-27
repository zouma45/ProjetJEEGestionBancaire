package beans.entete_facture;

import java.util.List;

import beans.GenericServicesImpl;
import dao.EnteteFactureDAOImpl;

public class EnteteFactureServicesImpl extends GenericServicesImpl<EnteteFacture, Integer>
		implements EnteteFactureServices {

	EnteteFactureDAOImpl enteteFactureDao;

	public EnteteFactureServicesImpl() {
		enteteFactureDao = new EnteteFactureDAOImpl();
	}

	@Override
	public void add(EnteteFacture entity) {
		enteteFactureDao.add(entity);

	}

	@Override
	public void update(EnteteFacture entity) {
		enteteFactureDao.update(entity);

	}

	@Override
	public void remove(EnteteFacture entity) {
		enteteFactureDao.remove(entity);

	}

	@Override
	public List<EnteteFacture> show() {

		return enteteFactureDao.getAll();
	}

	@Override
	public EnteteFacture getById(int id) {
		return enteteFactureDao.find(id);
	}

}
