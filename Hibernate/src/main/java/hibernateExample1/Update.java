package hibernateExample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Update {

	public static void main(String[] args) {
		SessionFactory sf = HibernateConfiguration.provideSf();
		Session ses = sf.openSession();
		Transaction ts = ses.beginTransaction();
		Myclass s1 = ses.get(Myclass.class, 2);
		s1.setSname("Barbie");
		ts.commit();
		ses.close();
	}

}
