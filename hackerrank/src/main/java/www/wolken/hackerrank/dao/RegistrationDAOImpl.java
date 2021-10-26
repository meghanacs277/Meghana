package www.wolken.hackerrank.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import www.wolken.hackerrank.entity.HackerLoginEntity;
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

	public HackerLoginEntity getByEmail(String email) {
		// TODO Auto-generated method stub
		Session session=null;
		HackerLoginEntity entity=null;
		try {
			SessionFactory factory=HibernateUtil.getInstance();
			session=factory.openSession();
			
			@SuppressWarnings("unchecked")
			Query<HackerLoginEntity> query=session.createNamedQuery("getByEmail");
			query.setParameter("email", email);
			entity=(HackerLoginEntity) query.uniqueResult();
		}
		finally {
			session.close();
		}
		return entity;
	
	}

	public int forgotPassword(HackerLoginEntity entity) {
		
		// TODO Auto-generated method stub
		SessionFactory factory=null;
		Session session=null;
		int rows=0;
		try {
			factory=HibernateUtil.getInstance();
			session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			@SuppressWarnings("unchecked")
			Query<HackerLoginEntity> query=session.createNamedQuery("updatePassword");
			query.setParameter("newPassword", entity.getPassword());
			query.setParameter("email", entity.getEmail());
			rows=query.executeUpdate();
			transaction.commit();
		}finally {
			session.close();
		}
		return rows;	
		
	


	}
	

}
