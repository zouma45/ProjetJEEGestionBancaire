package beans;

import java.io.Serializable;
import java.util.List;

import dao.GenericDao;





public abstract class GenericServicesImpl<T,  PK extends Serializable> implements GenericService<T,  PK> {

	private GenericDao<T,  PK> genericDao;

	public GenericServicesImpl(GenericDao<T, PK> genericDao) {
		this.genericDao = genericDao;
	}

	public GenericServicesImpl() {
	}	
	@Override
	//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public List<T> show() {
		return genericDao.getAll();
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED, readOnly = true)
	public T getById(PK id) {
		return genericDao.find(id);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public void add(T entity) {
		genericDao.add(entity);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public void update(T entity) {
		genericDao.update(entity);
	}

	@Override
	//@Transactional(propagation = Propagation.REQUIRED)
	public void remove(T entity) {
		genericDao.remove(entity);
	}

}
