package www.wolken.Butterfly;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import www.wolken.Butterfly.Entity.butterflydetails;


public class tester {
	public static void main(String[] arg) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernet.cfg.xml");
		SessionFactory factory=configuration.buildSessionFactory();
		Session session=factory.openSession();
		butterflydetails details=(butterflydetails)session.get(butterflydetails.class,"suma");
		System.out.println(details);
		session.close();
		factory.close();
		
	}

}
