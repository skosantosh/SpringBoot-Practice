package com.main.controller;

//"redirect:/userList"
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.main.DTO.UserDTO;

import com.main.service.UserStudentService;

@Controller
public class EditDeleteController {
	@Autowired
	UserStudentService userStudentService;

	@PostMapping("/updateUser")
	public String updateUser(@ModelAttribute UserDTO userDTO, Model model) {
		String message = userStudentService.updateUser(userDTO);
		model.addAttribute("message", message);
		return "redirect:/userList";
	}

}
