package com.jpa.test.services;

import com.jpa.test.entities.User;

import java.util.List;

public interface UserService {
	
	public User createUser(User user);
	
	public List<User> getallusers();
	
    public User getUserById(Long userId);

	public void updateuser(User user, Long userId);

	void deleteUser(Long uid);
    
//    List<User> getAllUsers();
//
//    User updateUser(User user);
//
//    void deleteUser(Long userId);

}
