package www.wolken.hackerrank.service;

import www.wolken.hackerrank.dto.LoginDTO;
import www.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {
	String validateAndSave(UserDTO dto);


	String validateAndLogin(LoginDTO ldto);

	String validateAndUpdatePassword(String email);
	

}
