package com.ust.pms.service;

import java.util.List;

import com.ust.pms.model.User;
import com.ust.pms.model.UserRegistration;

public interface UserRegistrationService {

	public String saveUserRegistration(UserRegistration userRegistration);
	public String updateUserRegistration(UserRegistration userRegistration);
	public String deleteUserRegistration(int userRegistrationId);
	public List<UserRegistration> getUsersRegistration();
	public UserRegistration getUserRegistration(int userRegistrationId);
	public boolean isUserRegistrationExists(int userRegistrationId);
	


}
