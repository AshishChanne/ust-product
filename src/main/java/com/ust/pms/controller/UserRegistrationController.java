package com.ust.pms.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.UserRegistration;
import com.ust.pms.service.UserRegistrationService;

@RestController
@RequestMapping("userRegistration")
//@CrossOrigin(origins = "http://localhost:4200")
public class UserRegistrationController {

	@Autowired
	UserRegistrationService userRegistrationService;

	List<UserRegistration> UsersRegistration = new ArrayList<UserRegistration>();

	// Getting All the Users
	@GetMapping()
	public ResponseEntity<List<UserRegistration>> getUsersRegistration() {
		UsersRegistration = userRegistrationService.getUsersRegistration();
		return new ResponseEntity<List<UserRegistration>>(UsersRegistration, HttpStatus.OK);
	}

	// Saving the User
	@PostMapping()
	public ResponseEntity<String> saveUserRegistration(@RequestBody UserRegistration UserRegistration) {
		System.out.println(UserRegistration);
		userRegistrationService.saveUserRegistration(UserRegistration);
		return new ResponseEntity<String>("Record Saved Successfully", HttpStatus.OK);
	}

	// Getting a single User
	@GetMapping("/{UserId}")
	public ResponseEntity<UserRegistration> getUserRegistration(@PathVariable("UserId") Integer UserRegistrationId) {
		System.out.println("User id called");
		if (userRegistrationService.isUserRegistrationExists(UserRegistrationId)) {
			UserRegistration UserRegistration = userRegistrationService.getUserRegistration(UserRegistrationId);
			return new ResponseEntity<UserRegistration>(UserRegistration, HttpStatus.OK);
		} else {
			return new ResponseEntity<UserRegistration>(HttpStatus.NO_CONTENT);
		}
	}

	// delete
	@DeleteMapping("/{UserId}")
	public ResponseEntity<String> deleteUser(@PathVariable("UserId") Integer UserId) {
System.out.println( "Delete controller");
		if (userRegistrationService.isUserRegistrationExists(UserId)) {
			userRegistrationService.deleteUserRegistration(UserId);
			return new ResponseEntity<String>("Deleted Ok", HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("Deleted not ", HttpStatus.NO_CONTENT);

		}
	}

	// update
	@PutMapping()
	public ResponseEntity<String> updateUser(@RequestBody UserRegistration UserRegistration) {

		if (userRegistrationService.isUserRegistrationExists(UserRegistration.getRegistrationId())) {
			userRegistrationService.updateUserRegistration(UserRegistration);
			return new ResponseEntity<String>("Updated Ok", HttpStatus.OK);

		} else {
			return new ResponseEntity<String>("Updated failed ", HttpStatus.NO_CONTENT);

		}
	}
	

}
