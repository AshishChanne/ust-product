package com.ust.pms.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cred")
public class CredentialConfiguration {
	
	private String userName;
	private String password;
	private String screteQuestion;
	private String screteAnswer;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getScreteQuestion() {
		return screteQuestion;
	}
	public void setScreteQuestion(String screteQuestion) {
		this.screteQuestion = screteQuestion;
	}
	public String getScreteAnswer() {
		return screteAnswer;
	}
	public void setScreteAnswer(String screteAnswer) {
		this.screteAnswer = screteAnswer;
	}
	

}
