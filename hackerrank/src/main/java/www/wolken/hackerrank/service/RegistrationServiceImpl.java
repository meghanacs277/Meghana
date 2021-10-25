package www.wolken.hackerrank.service;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import www.wolken.hackerrank.dao.RegistrationDAO;
import www.wolken.hackerrank.dao.RegistrationDAOImpl;
import www.wolken.hackerrank.dto.UserDTO;
import www.wolken.hackerrank.entity.UserEntity;


public class RegistrationServiceImpl implements RegistrationService{
	RegistrationDAO dao=new RegistrationDAOImpl();
	
	public String validateAndSave(UserDTO dto) {
		UserEntity entity=new UserEntity();
		entity.setId(dto.getId());
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setPassword(dto.getPassword());
		entity.setContact(dto.getContact());
		
		int rows=dao.save(entity);
		System.out.println(rows);
		return null;
	
	

}
