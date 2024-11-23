package com.jpa.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jpa.test.entities.User;
import com.jpa.test.services.UserService;

@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userervice;
	
	@PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
//        UserService userService = null;
		User savedUser = userervice.createUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
	
	@PostMapping("/welcome")
	public String getWelcomeString(@RequestBody Object  obj) {
		return "Welcome navhi";
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getallusers()
	{
		List<User> list=this.userervice.getallusers();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
	
	@GetMapping("{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Long userId){
//        UserService userService = null;
		User user = userervice.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }
	
	@PutMapping("/users/{userId}")
	public ResponseEntity<User> updatbookById(@RequestBody User user,@PathVariable("userId") Long userId)
	{
		try {
			this.userervice.updateuser(user,userId);
//			return book;
			return ResponseEntity.of(Optional.of(user));
		} catch (Exception e) {
			
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
	@DeleteMapping("/users/{userid}")
	public ResponseEntity<Void> deleteByID(@PathVariable("userid") Long userid)
	{
		try {
			this.userervice.deleteUser(userid);
			return ResponseEntity.ok().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}
