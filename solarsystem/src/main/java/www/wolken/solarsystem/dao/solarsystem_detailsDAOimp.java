package www.wolken.solarsystem.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import www.wolken.solarsystem.entity.solarsystem_detailss;
import www.wolken.solarsystem.util.HibernateUtils;

public class solarsystem_detailsDAOimp implements solarsystem_detailsDAO {

	public boolean save(solarsystem_detailss entity) {
		
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.save(entity);
			transaction.commit();
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean getById(int id) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		solarsystem_detailss entity=null;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			entity=session.get(solarsystem_detailss.class,id);
			System.out.println(entity);
			if(entity!=null) {
				result=true;
			}else {
				result=false;
			}
		}finally {
			session.close();
		}
		return result;
	}

	public boolean updateById(solarsystem_detailss entity) {
		SessionFactory factory=null;
		Session session=null;
		boolean result=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.saveOrUpdate(entity);
			transaction.commit();
			result=true;
		}finally {
			session.close();
		}
		return result;
	}
		


	public boolean deleteById(solarsystem_detailss entity) {
		// TODO Auto-generated method stub
		SessionFactory factory=null;
		Session session=null;
		boolean result12=false;
		try {
			factory=HibernateUtils.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			session.delete(entity);
			transaction.commit();
			result12=true;
		}finally {
			session.close();
		}
		return false;
	}

}
