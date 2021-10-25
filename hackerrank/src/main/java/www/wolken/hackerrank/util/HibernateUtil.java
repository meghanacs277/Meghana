package www.wolken.hackerrank.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
    private  HibernateUtil() {
    	
    }

    public static SessionFactory getInstance() {
        if (factory==null){
            Configuration configuration=new Configuration();
            configuration.configure();
            factory=configuration.buildSessionFactory();
        }
        return factory;
    }

    static public void closeFactory(){
        factory.close();
    }

}
