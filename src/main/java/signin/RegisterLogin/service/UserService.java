package signin.RegisterLogin.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import signin.RegisterLogin.model.User;
import signin.RegisterLogin.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
