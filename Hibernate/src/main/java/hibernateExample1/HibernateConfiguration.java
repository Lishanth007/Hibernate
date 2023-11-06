package hibernateExample1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {
	public static SessionFactory provideSf() {
		Configuration cfg = new Configuration();
		cfg.configure();
		return cfg.buildSessionFactory();
	}
}