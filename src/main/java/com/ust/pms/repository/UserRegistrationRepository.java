package com.ust.pms.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ust.pms.model.UserRegistration;

@Repository
public interface UserRegistrationRepository extends CrudRepository<UserRegistration, Integer>{

}
