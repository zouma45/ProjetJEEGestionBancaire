package dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("unchecked")
public abstract class GenericDaoHibernateImpl<E, PK extends Serializable> implements GenericDao<E, PK> {
	/**
	 * By defining this class as abstract, we prevent Spring from creating
	 * instance of this class If not defined as abstract,
	 * getClass().getGenericSuperClass() would return Object. There would be
	 * exception because Object class does not hava constructor with parameters.
	 */
	protected Class<? extends E> daoType;
	public static SessionFactory sessionFactory;

	@SuppressWarnings("rawtypes")
	public GenericDaoHibernateImpl() {
		Type t = getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		daoType = (Class) pt.getActualTypeArguments()[0];
	}

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

	public static SessionFactory getSession() {
		return sessionFactory;
	}

	protected Session currentSession() {
		return getSession().getCurrentSession();
	}

	@Override
	public void add(E entity) {
		currentSession().beginTransaction();
		currentSession().save(entity);
		currentSession().getTransaction().commit();

	}

	@Override
	public void update(E entity) {
		currentSession().beginTransaction();
		currentSession().update(entity);
		currentSession().getTransaction().commit();
	}

	@Override
	public void remove(E entity) {
		currentSession().beginTransaction();
		// E oldEntity = (E) currentSession().l;
		currentSession().delete(entity);
		currentSession().getTransaction().commit();
	}

	@Override
	public E find(PK key) {
		currentSession().beginTransaction();
		return (E) currentSession().get(daoType, key);
	}

	@Override
	public List<E> getAll() {
		currentSession().beginTransaction();
		return currentSession().createCriteria(daoType).list();
	}

}
