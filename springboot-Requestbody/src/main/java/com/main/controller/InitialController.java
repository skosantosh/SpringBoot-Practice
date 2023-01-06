package com.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.main.DTO.StudentDTO;
import com.main.DTO.UserDTO;
import com.main.service.UserStudentService;

//@Controller
//@GetMapping

@Controller
public class InitialController {
	@Autowired
	UserStudentService userStudentService;

	@GetMapping({ "/", "/index" })
	public String root(Model model) {
		return "index";
	}

	@GetMapping("/registration")
	public String register() {
		return "newUser";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@PostMapping("/logInUser")
	public String loginUser(@RequestParam String username, @RequestParam String password, @RequestParam String usertype,	HttpSession session) {

		if (usertype.equals("user")) {
			UserDTO userDTO = userStudentService.loginByUser(username, password);
			if (userDTO.getId() > 0) {
				session.setAttribute("username", "Welcome: " + userDTO.getUsername() );
				session.setAttribute("id", userDTO.getId());
				session.setAttribute("usertype", userDTO.getUsertype());
				return "index";
			} else {
				session.setAttribute("username", "User Name " + username + " login error");
				return "login";
			}

		} else if (usertype.equals("student")) {
			StudentDTO studentDTO = userStudentService.loginByStudent(username, password);
			session.setAttribute("username", "Welcome: " + studentDTO.getUsername() );
			session.setAttribute("id", studentDTO.getId());
			session.setAttribute("usertype", studentDTO.getUsertype());
			return "index";
		} else {
			session.setAttribute("username", "User Name " + username + " login error");
			return "login";
		}

	}

	@GetMapping("/editProfileus")
	public String editProfileus(@RequestParam int id, @RequestParam String usertype, Model model) {
		if (usertype.equals("user")) {
			UserDTO userDTO = userStudentService.getDetailUser(id, usertype);
			model.addAttribute("userprofile", userDTO);
		} else if (usertype.equals("student")) {
			StudentDTO studentDTO = userStudentService.getDetailStudent(id, usertype);
			model.addAttribute("userprofile", studentDTO);
		}
		return "profileUserStudent";
	}

	@GetMapping("/logOut")
	public String logOut(HttpSession session) {
		session.invalidate();
		return "index";
	}

	@GetMapping("/backbutton")
	public String goBack() {
		return "index";
	}

}
