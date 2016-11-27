package beans;

import java.io.Serializable;
import java.util.List;


public interface GenericService <T, PK extends Serializable> {
	public void add(T entity);

	public void update(T entity);

	public void remove(T entity);
	
	public List<T> show();
	
    public T getById(PK id);;
	
	

	

	
}
