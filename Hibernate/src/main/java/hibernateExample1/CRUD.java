package hibernateExample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CRUD {

	public static void main(String[] args) {
		SessionFactory sf = HibernateConfiguration.provideSf();
		Session ses = sf.openSession();
		Transaction ts = ses.beginTransaction();

		// Create
		Myclass s1 = new Myclass(1, "Lishanth", 1, 3);
		ses.save(s1);
		Myclass s2 = new Myclass(2, "Barbie", 3, 6);
		ses.save(s2);
		Myclass s3 = new Myclass(3, "Cream", 6, 9);
		ses.save(s3);

		// Retrieve
		System.out.println(s1.getSid() + " " + s1.getSname());

		// Update
		s2.setSname("Doll");

		// delete
		ses.delete(s3);
		ts.commit();
	}

}
