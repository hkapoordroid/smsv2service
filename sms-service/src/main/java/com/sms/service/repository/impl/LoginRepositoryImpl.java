package com.sms.service.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBQueryExpression;
import com.sms.service.model.Login;
import com.sms.service.repository.LoginRepository;

@Repository("LoginRepository")
public class LoginRepositoryImpl implements LoginRepository {

		DynamoDBMapper mapper;
		
		@Autowired
		public LoginRepositoryImpl(DynamoDBMapper mapper) {
			this.mapper = mapper;
		}

		public Login add(Login login) {
			mapper.save(login);
			
			return login;
		}
		
		public Login retrieve(String email) {
			Login login = mapper.load(Login.class, email);
			
			return login;
		}
		
		public Boolean exists(String email) {
			Login login = new Login();
			login.setEmail(email);
			
			DynamoDBQueryExpression<Login> queryExpression = new DynamoDBQueryExpression<Login>().withHashKeyValues(login);
			
			List<Login> loginList = mapper.query(Login.class, queryExpression);
			
			return loginList.size() > 0;
		}
		
		public void update(Login login) {
			mapper.save(login);
		}
		
		public void delete(Login login) {
			mapper.delete(login);
		}
}
