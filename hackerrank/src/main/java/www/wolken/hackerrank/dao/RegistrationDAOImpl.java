package www.wolken.hackerrank.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import www.wolken.hackerrank.entity.UserEntity;
import www.wolken.hackerrank.util.HibernateUtil;


public class RegistrationDAOImpl implements RegistrationDAO {
	public int save(UserEntity entity) {
		SessionFactory factory=null;
		Session session=null;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
		}			
		finally {
			session.close();
		}
		return 0;
	}
	

}
