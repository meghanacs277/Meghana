package www.wolken.solarsystem.util;



	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	public class HibernateUtils {
		private static SessionFactory factory=null;
		
		private HibernateUtils() {
			// TODO Auto-generated constructor stub
		}
		public static SessionFactory getInstance() {
			if(factory == null) {
				Configuration configuration=new Configuration();
				configuration.configure();
				factory=configuration.buildSessionFactory();
			}
			return factory;
		}
	}
	
