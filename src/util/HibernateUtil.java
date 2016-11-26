package util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	public static SessionFactory sessionFactory;

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
}
