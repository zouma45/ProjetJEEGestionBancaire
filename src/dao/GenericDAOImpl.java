package dao;

import java.io.Serializable;
import java.util.List;

public class GenericDAOImpl <T, ID extends Serializable> implements GenericDAO<T, ID> {

	@Override
	public void ajouter(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimer(T entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T findByID(Class clazz, Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findAll(Class clazz) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
