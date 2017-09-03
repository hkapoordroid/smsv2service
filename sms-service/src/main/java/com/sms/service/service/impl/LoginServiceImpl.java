package com.sms.service.service.impl;

import com.sms.service.model.Login;
import com.sms.service.repository.LoginRepository;
import com.sms.service.service.LoginService;
import static com.sms.service.common.Utils.stringNullOrEmtpy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
	LoginRepository loginRepository;

	@Autowired
	public LoginServiceImpl(LoginRepository loginRepository) {
		this.loginRepository = loginRepository;
	}

	public Login Add(Login login) throws Exception {
		// make sure new login has email, password set
		if (stringNullOrEmtpy(login.getEmail()))
			throw new Exception("email cannot be null or empty");

		// check if the login already exists
		if (loginRepository.exists(login.getEmail()))
			throw new Exception("Login Already Exists");

		// create the new login
		// TODO: perform the one way hash of password
		loginRepository.add(login);

		return login;
	}
}
