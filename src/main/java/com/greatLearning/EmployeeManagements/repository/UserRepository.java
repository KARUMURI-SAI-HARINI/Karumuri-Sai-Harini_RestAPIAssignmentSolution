package com.greatLearning.EmployeeManagements.repository;

import com.greatLearning.EmployeeManagements.entity.User;

public interface UserRepository {

	public User getUserByUsername(String username);

}
