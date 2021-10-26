package www.wolken.hackerrank.dao;

import www.wolken.hackerrank.entity.HackerLoginEntity;
import www.wolken.hackerrank.entity.UserEntity;

public interface RegistrationDAO {
	
	int save(UserEntity entity);

	HackerLoginEntity getByEmail(String name);

	int forgotPassword(HackerLoginEntity entity);



}
