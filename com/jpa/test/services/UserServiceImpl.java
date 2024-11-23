package com.jpa.test.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;
//import org.apache.logging.log4j.util.Strings;
//import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService {
	
//	ArrayList<User> list=new ArrayList<>();
	@Autowired
	private UserRepository userRepository;

	//Save user
	@Override
	public User createUser(User user) {
//		System.out.println(list.add(user));
		return userRepository.save(user);
	}

	//Get user by id
	@Override
	public User getUserById(Long userId) {
		Optional<User> optionalUser = userRepository.findById(userId);
		return optionalUser.get();
	}

	//Get all users 
	@Override
	public List<User> getallusers() {
		
		List<User> list=(List<User>)this.userRepository.findAll();
		
		return list;
		
	}
	//Update User
	public void updateuser(User user,Long userid)
	{
		
		user.setId(userid);
		
		this.userRepository.save(user);
		
	}
	
	//Delete Single User By id
	@Override
	public void deleteUser(Long uid) {
		
		this.userRepository.deleteById(uid);
		
	}
	
	
//	@Override
//	public List<User> getAllUsers() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public User updateUser(User user) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void deleteUser(Long userId) {
//		// TODO Auto-generated method stub
//		
//	}
}
