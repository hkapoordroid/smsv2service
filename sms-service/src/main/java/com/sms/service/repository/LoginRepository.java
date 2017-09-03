package com.sms.service.repository;

import com.sms.service.model.Login;

public interface LoginRepository {
	public Login add(Login login);
	
	public Login retrieve(String email);
	
	public Boolean exists(String email);
	
	public void update(Login login);
	
	public void delete(Login login);

}
