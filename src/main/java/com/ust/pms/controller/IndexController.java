package com.ust.pms.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.CredentialConfiguration;

@RestController
public class IndexController {

	@Autowired(required=false)
	private CredentialConfiguration cred;
	@Value("${name}")
	String name;
	
	@RequestMapping("/")
	//public CredentialConfiguration index() {
	
	public Map index() {
		
		
		/*cred.setUserName("priti1"+name);
		cred.setPassword("priti2");
		cred.setScreteQuestion("priti3");
		cred.setScreteAnswer("priti4");*/
		
		
		Map data=new HashMap();
		
		data.put("username",cred.getUserName());
		data.put("password",cred.getPassword());
		data.put("screteQuestion",cred.getScreteQuestion());
		data.put("screteAnswer",cred.getScreteAnswer());
		return data;
	}
	
	@RequestMapping("/customer/{custName}")
	public String customer(@PathVariable("custName")String custName) {
		
		return "Hello customer...."+custName;
	}
}
