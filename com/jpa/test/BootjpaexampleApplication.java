package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	
	public static void main(String[] args) {
		
		ApplicationContext context= SpringApplication.run(BootjpaexampleApplication.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
		
		
//		User user=new User();
//		user.setName("Dhanraj pawar");
//		user.setCity("Karad"); 
//		user.setStatus("I am a java developer");
//		
//    	User user1= userRepository.save(user);
//		
//		System.out.println(user1);
		
//		User user1=new User();
//		user1.setName("Abhishek Musale");
//		user1.setCity("Temburni");
//		user1.setStatus("Trader");
//		
//		User user2=new User();
//		user2.setName("xyz");
//		user2.setCity("Ti");
//		user2.setStatus("Tranderr");
		
		//single save
//		User user2= userRepository.save(user1);
//		System.out.println("saved user"+user2);
//		System.out.println("done");
		
		//multiple save object
//		List<User> users= List.of(user1,user2);
//		Iterable <User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->
//		{
//			System.out.println(user);
//			System.out.println("Successfull");
//		});
//		
		
		//update the database
//		Optional<User> optional= userRepository.findById(103);
//		User user =optional.get();
//		user.setName("Harshad yadav");
//		
//		User result= userRepository.save(user);
//		System.out.println(result);
		
		System.out.println("Execute Successfully!!!!");
	}

}
