package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.main.DTO.UserDTO;
import com.main.service.UserStudentService;

//@RestController
public class RetrieveController {
	//@Autowired
	UserStudentService userStudentService;

	// localhost:9999/getaUsers
	@GetMapping("/getaUsers")
	public List<UserDTO> getaUsers() {
		List<UserDTO> userDTOs = userStudentService.getAllUser();
		return userDTOs;
	}

	// localhost:9999/getaUserId?id=1
	@GetMapping("/getaUserId")
	public UserDTO getaUser(@RequestParam int id) {
		UserDTO userDTO = userStudentService.getDetailUser(id, "user");
		return userDTO;
	}

	// localhost:9999/getaUserIU?id=2&usertype=user
	@GetMapping("/getaUserIU")
	public UserDTO getaUser(@RequestParam int id, @RequestParam String usertype) {
		UserDTO userDTO = userStudentService.getDetailUser(id, usertype);
		return userDTO;
	}

	// using pathVariable
	// http://localhost:9999/getaUserpp/id/2/usertype/user
	@GetMapping("/getaUserpp/id/{userid}/usertype/{usertype}")
	public UserDTO getUserpp(@PathVariable int userid, @PathVariable String usertype) {
		UserDTO userDTO = userStudentService.getDetailUser(userid, usertype);
		return userDTO;
	}

	// using pathVariable in RequestMapping
	// http://localhost:9999/getaUserp/id/2/usertype/user
	@RequestMapping(value = "/getaUserp/id/{userid}/usertype/{usertype}",method = RequestMethod.GET)
	public UserDTO getUserp(@PathVariable int userid,@PathVariable String usertype) {
		UserDTO userDTO = userStudentService.getDetailUser(userid, usertype);
		return userDTO;
	}
	//localhost:9999/createUser
	//Body like this in postman id auto increment
	/*
	 * { "fname": "Ramesh",
	 *  "lname": "Karki", 
	 *  "username": "ramesh", 
	 *  "password":  "ramesh", 
	 *  "sdate": null, 
	 *  "usertype": "user", 
	 *  "userpower": "user",
	 *   "email": "ramesh@jo6s.com" }
	 */
	
	
	
	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public String createUser(@RequestBody UserDTO userDTO) {
		String message = userStudentService.createUser(userDTO);
		return message;
	}
	 
	
	
	
	
	//localhost:9999/createUserUpdate
		//Body like this in postman id  hare require because is there is same id it update
		/*
		 * {"id":8,
		 *  "fname": "Ramesh",
		 *  "lname": "Karki", 
		 *  "username": "ramesh", 
		 *  "password":  "ramesh", 
		 *  "sdate": null, 
		 *  "usertype": "user", 
		 *  "userpower": "user",
		 *   "email": "ramesh@jo6s.com" }
		 */
	
	@RequestMapping(value="/createUserUpdate",method=RequestMethod.POST)  
	public String createUserUP(@RequestBody UserDTO userDTO){
		String message=userStudentService.updateUser(userDTO);
		return message;
	}
	
	

}
