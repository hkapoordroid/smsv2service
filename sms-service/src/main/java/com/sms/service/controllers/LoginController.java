package com.sms.service.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.sms.service.model.Login;
import com.sms.service.repository.LoginRepository;
import com.sms.service.repository.impl.LoginRepositoryImpl;
import com.sms.service.service.LoginService;
import com.sms.service.service.impl.LoginServiceImpl;

@RestController
@RequestMapping("/")
public class LoginController {
	private LoginService loginService;

	public LoginController() {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
				new AwsClientBuilder.EndpointConfiguration("http://localhost:8000", "us-west-2")).build();
		DynamoDBMapper mapper = new DynamoDBMapper(client);
		LoginRepository loginRepository = new LoginRepositoryImpl(mapper);
		loginService = new LoginServiceImpl(loginRepository);
	}

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public void add(@RequestBody Login login) {
		try {
			loginService.Add(login);
		}
		catch (Exception e) {
			//DO Nothing for now
		}
	}
	

	@RequestMapping(value="/", method=RequestMethod.GET)
	public String main() {
		return "Hello World!";
	}
}
