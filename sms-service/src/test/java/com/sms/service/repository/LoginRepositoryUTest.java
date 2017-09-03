package com.sms.service.repository;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.sms.service.model.Login;
import com.sms.service.repository.impl.LoginRepositoryImpl;

public class LoginRepositoryUTest {
	
	LoginRepository loginRepository;

	@Before
	public void setUpUTest() {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		loginRepository = new LoginRepositoryImpl(mapper);
	}
	
	@Test
	public void retrieveLogin() {
		Login login = loginRepository.retrieve("hkapoordroid@gmail.com");
		assertThat(login.getEmail(), is(equalTo("hkapoordroid@gmail.com")));
	}
	
	

}
