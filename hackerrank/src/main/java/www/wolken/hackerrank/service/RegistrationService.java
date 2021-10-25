package www.wolken.hackerrank.service;

import www.wolken.hackerrank.dto.UserDTO;

public interface RegistrationService {
	String validateAndSave(UserDTO dto);

}
