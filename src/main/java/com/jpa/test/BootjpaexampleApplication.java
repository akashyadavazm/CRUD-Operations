package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

//		--------> ------------------> ----------------------> _------------------------->
//		User user1 = new User();
//		user1.setName("Ranjit Rana");
//		user1.setCity("Hisar");
//		user1.setStatus("I am enterpreneur");
//		
//		User user2 = new User();
//		user2.setName("Vikram");
//		user2.setCity("Aurangabad");
//		user2.setStatus("I am Doctor");
//		
//		List <User> users = List.of(user1 , user2);
////		
//		Iterable<User> resultIterable = userRepository.saveAll(users);
//		
//		resultIterable.forEach(user -> {
//			System.out.println(user);
//		});

//		System.out.println(user1);
//	------> --------------> --------------------> --------------------------------->	
//		Update the user of id 11
//		Optional<User> optional = userRepository.findById(2);
//		
//		User user = optional.get();
//		user.setCity("Delhi");
//		User result = userRepository.save(user);
//		
//		System.out.println(result);

//		-------> -------------> ------------------> ------------------------->
//		Use Iterator to print all the data available

//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user);
//		}
//			---------> ----------> ------------------>
//			For Custom Finder
//			List<User> users = userRepository.findByName("Vikram");
//			users.forEach(e -> {
//				System.out.println(e);
//			});

//		For Updation of data

//		Optional<User> optional = userRepository.findById(52);
//		
//		User user = optional.get();
//		user.setName("Ranjeet");
//		
//		userRepository.save(user);
//		System.out.println(user);

//			Deleting the Element
//			userRepository.deleteById(102);
//			System.out.println("Deleted");

//			Iterable<User> allUsers = userRepository.findAll();

//			userRepository.deleteAll(allUsers);

//		List <User> usersA = userRepository.findByNameAndCity("Vikram", "Aurangabad");
//		
//		usersA.forEach(e -> System.out.println(e));
//		
//		List <User> usersB = userRepository.findByNameStartingWith("V");
//		
//		usersB.forEach(e -> System.out.println(e));

//		List <User> usersC = userRepository.getAllUsers();
//		
//		usersC.forEach(e -> System.out.println(e));

		List<User> usersD = userRepository.getUserByName("Ranjit Rana");

		usersD.forEach(e -> System.out.println(e));

		System.out.println("---------------------------------");

		userRepository.getUsers().forEach(e -> {
			System.out.println(e);
		});
		;

	}

}
