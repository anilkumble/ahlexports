package com.ahlexports.springbootstarter.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	private List<User> users = Arrays.asList(
			new User("1","kumble","thiruvanmyur"),
			new User("2","kumble","tambaram"),
			new User("3","gokul","perungudi")
			);
	
	public List<User> getAllUsers(){
		List<User> listOfUser = new ArrayList<User>();
		userRepository.findAll().forEach(listOfUser::add);
		return listOfUser;
	}
	public void addUser(User u) {
		userRepository.save(u);
	}
	public User getUser(String id) {
		return users.stream().filter(s -> s.getId().equals(id)).findFirst().get();
	}
}
