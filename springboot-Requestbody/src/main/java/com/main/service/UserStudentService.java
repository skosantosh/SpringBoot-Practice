package com.main.service;

import java.util.List;

import com.main.DTO.StudentDTO;
import com.main.DTO.UserDTO;



public interface UserStudentService {
	String createUser(UserDTO userDTO);

	String createStudent(StudentDTO studentDTO);
	List<UserDTO> getAllUser(String userType);
	List<UserDTO> getAllUser();

	List<StudentDTO> getAllStudent(String userType);
	List<StudentDTO> getAllStudent();
	
	String deleteUser(int id);

	String deleteStudent(int id);

	String updateUser(UserDTO userDTO);

	String updateStudent(StudentDTO studentDTO);

	UserDTO getDetailUser(int id,String type);

	StudentDTO getDetailStudent(int id, String type);
	
	UserDTO  loginByUser(String userName, String password);
	StudentDTO loginByStudent(String userName, String password);
	
	List<StudentDTO> getAllStudentByUserType(String usertype);
	List<UserDTO> getAllUserByUserType(String usertype);

}
