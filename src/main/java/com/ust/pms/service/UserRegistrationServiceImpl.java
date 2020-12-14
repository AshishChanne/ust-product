package com.ust.pms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.UserRegistration;
import com.ust.pms.repository.UserRegistrationRepository;

@Service
public class UserRegistrationServiceImpl implements UserRegistrationService {

	@Autowired
	UserRegistrationRepository userRegistrationRepository;

	@Override
	public String saveUserRegistration(UserRegistration User) {

		userRegistrationRepository.save(User);
		return "User Saved Successfully";

	}

	@Override
	public String updateUserRegistration(UserRegistration User) {

	
			userRegistrationRepository.save(User);
			return "User Updated Successfully";
	
	}

	@Override
	public String deleteUserRegistration(int userId) {
		System.out.println("Delete Service");
		// TODO Auto-generated method stub
		userRegistrationRepository.deleteById(userId);
		return "User Deleted Successfully";

	}

	@Override
	public List<UserRegistration> getUsersRegistration() {
		// TODO Auto-generated method stub
		return (List<UserRegistration>) userRegistrationRepository.findAll();
	}

	@Override
	public UserRegistration getUserRegistration(int UserRegistrationId) {
		// TODO Auto-generated method stub
		Optional<UserRegistration> UserData = userRegistrationRepository.findById(UserRegistrationId);
		UserRegistration userRegistration = UserData.get();
		return userRegistration;
	}
	
	@Override
	public boolean isUserRegistrationExists(int UserRegistrationId) {

		return userRegistrationRepository.existsById(UserRegistrationId);
	}

}
