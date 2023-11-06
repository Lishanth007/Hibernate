package hibernateExample1;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SelectView {

	public static void main(String[] args) {
		SessionFactory sf = HibernateConfiguration.provideSf();
		Session ses = sf.openSession();
		Transaction ts = ses.beginTransaction();

		List<Myclass> students = ses.createQuery("from Myclass", Myclass.class).list();

		for (Myclass student : students) {
			System.out.println(student.getSid() +" "+ 
							   student.getSname() +" "+ 
							   student.getSclass() +" "+ 
							   student.getSsubjects());
		}
		ts.commit();
		ses.close();
	}

}
