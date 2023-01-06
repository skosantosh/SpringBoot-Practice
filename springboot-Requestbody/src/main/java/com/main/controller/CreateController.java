
package com.main.controller;

//@ModelAttribute

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.DTO.StudentDTO;
import com.main.DTO.UserDTO;
import com.main.service.UserStudentService;

@Controller

public class CreateController {

	@Autowired
	UserStudentService userStudentService;

	/*
	 * @PostMapping("/createNewUser") public String userResister(@ModelAttribute
	 * UserDTO userDTO, Model model) { if (userDTO.getUsertype().equals("user")) {
	 * String message = userStudentService.createUser(userDTO);
	 * model.addAttribute("message", message); } return "newUser"; }
	 */

	/*
	 * @PostMapping("/createNewUser") public String studentResister(@ModelAttribute
	 * StudentDTO studentDTO, Model model) { if
	 * (studentDTO.getUsertype().equals("student")) { String message =
	 * userStudentService.createStudent(studentDTO); model.addAttribute("message",
	 * message); } return "newUser"; }
	 */

	@PostMapping("/createNewUser")
	public String userResister(@ModelAttribute UserDTO userDTO, @ModelAttribute StudentDTO studentDTO, Model model) {
		if (userDTO.getUsertype().equals("user")) {
			String message = userStudentService.createUser(userDTO);
			model.addAttribute("message", message);
		}
		if (studentDTO.getUsertype().equals("student")) {
			String message = userStudentService.createStudent(studentDTO);
			model.addAttribute("message", message);
		}
		return "newUser";
	}

	
}
