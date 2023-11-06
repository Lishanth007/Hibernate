package hibernateExample1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Create {

	public static void main(String[] args) {
		
		SessionFactory sf = HibernateConfiguration.provideSf();
		
		Session ses = sf.openSession();
		
		Transaction ts = ses.beginTransaction();
		
		Myclass stud1 = new Myclass(1, "Lishanth", 3, 6);
		ses.save(stud1);
		
		Myclass stud2 = new Myclass(2, "Sarah", 4, 7);
		ses.save(stud2);
		ts.commit();
	}

}
