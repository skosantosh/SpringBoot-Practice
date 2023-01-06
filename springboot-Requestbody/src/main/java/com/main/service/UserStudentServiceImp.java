package com.main.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
//@Service
//@Transactional
import org.springframework.stereotype.Service;

import com.main.DAO.StudentRepository;
import com.main.DAO.UserRepository;
import com.main.DTO.StudentDTO;
import com.main.DTO.UserDTO;
import com.main.entity.StudentEntity;
import com.main.entity.UserEntity;

@Service
@Transactional
public class UserStudentServiceImp implements UserStudentService {
	@Autowired
	UserRepository userRepository;
	@Autowired
	StudentRepository studentRepository;

	@Override
	public String createUser(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDTO, userEntity);
		userRepository.save(userEntity);
		return userEntity.getFname() + " Sucessfully Saved";
	}

	@Override
	public String createStudent(StudentDTO studentDTO) {
		StudentEntity studeEntity = new StudentEntity();
		BeanUtils.copyProperties(studentDTO, studeEntity);
		studentRepository.save(studeEntity);
		return studeEntity.getFname() + " Succcessfully Saved.";
	}

	@Override
	public List<UserDTO> getAllUser() {
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		List<UserEntity> userEntities = userRepository.findAll();

		for (UserEntity userEntity : userEntities) {
			UserDTO userDTO = new UserDTO();
			BeanUtils.copyProperties(userEntity, userDTO);
			userDTOs.add(userDTO);
		}
		return userDTOs;
	}

	@Override
	public List<StudentDTO> getAllStudent() {
		List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
		List<StudentEntity> studentEntities = studentRepository.findAll();
		for (StudentEntity studentEntity : studentEntities) {
			StudentDTO studentDTO = new StudentDTO();
			BeanUtils.copyProperties(studentEntity, studentDTO);
			studentDTOs.add(studentDTO);
		}
		return studentDTOs;
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateUser(UserDTO userDTO) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userDTO, userEntity);
		userRepository.save(userEntity);
		return userEntity.getFname() + " successfully update";
	}

	@Override
	public String updateStudent(StudentDTO studentDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getDetailUser(int id, String type) {
		UserDTO userDTO = new UserDTO();
		Optional<UserEntity> userEntity = userRepository.findByIdAndUsertype(id, type);
		if (userEntity.isPresent()) {
			BeanUtils.copyProperties(userEntity.get(), userDTO);
		}
		return userDTO;
	}

	@Override
	public StudentDTO getDetailStudent(int id, String type) {
		StudentDTO studentDTO = new StudentDTO();
		Optional<StudentEntity> studentEntity = studentRepository.getAllStudentByQuery(id, type);
		if (studentEntity.isPresent()) {
			BeanUtils.copyProperties(studentEntity.get(), studentDTO);
		}
		return studentDTO;
	}

	@Override
	public UserDTO loginByUser(String userName, String password) {
		UserDTO userDTO = new UserDTO();
		Optional<UserEntity> userEntity = userRepository.findByUsernameAndPassword(userName, password);
		if (userEntity.isPresent()) {
			BeanUtils.copyProperties(userEntity.get(), userDTO);
		}
		return userDTO;
	}

	@Override
	public StudentDTO loginByStudent(String userName, String password) {
		StudentDTO studentDTO = new StudentDTO();
		Optional<StudentEntity> studentEntity = studentRepository.findByUsernameAndPassword(userName, password);
		if (studentEntity.isPresent()) {
			BeanUtils.copyProperties(studentEntity, studentDTO);
		}
		return studentDTO;

	}

	@Override
	public List<StudentDTO> getAllStudentByUserType(String usertype) {
		StudentDTO studentDTO = new StudentDTO();
		List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
		
		Optional<StudentEntity> studentOpEntity = studentRepository.findByUsertype(usertype);
		if (studentOpEntity.isPresent()) {
			BeanUtils.copyProperties(studentOpEntity, studentDTO);
			studentDTOs.add(studentDTO);
		}
		return studentDTOs;
	}

	@Override
	public List<UserDTO> getAllUserByUserType(String usertype) {
		UserDTO userDTO = new UserDTO();
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		Optional<UserEntity> userOpEntity = userRepository.findByUsertype(usertype);
		
		if (userOpEntity.isPresent()) {
			BeanUtils.copyProperties(userOpEntity.get(), userDTO);
			userDTOs.add(userDTO);
		}
		return userDTOs;
	}

	@Override
	public List<StudentDTO> getAllStudent(String userType) {
		List<StudentDTO> studentDTOs = new ArrayList<StudentDTO>();
		List<StudentEntity> studentEntities = studentRepository.getAllStudentByQuery(userType);
		for (StudentEntity studentEntity : studentEntities) {
			StudentDTO studentDTO = new StudentDTO();
			BeanUtils.copyProperties(studentEntity, studentDTO);
			studentDTOs.add(studentDTO);
		}
		return studentDTOs;
	}

	@Override
	public List<UserDTO> getAllUser(String userType) {
		List<UserDTO> userDTOs = new ArrayList<UserDTO>();
		List<UserEntity> userEntities = userRepository.getAllUserByQuery(userType);

		for (UserEntity userEntity : userEntities) {
			UserDTO userDTO = new UserDTO();
			BeanUtils.copyProperties(userEntity, userDTO);
			userDTOs.add(userDTO);
		}
		return userDTOs;
	}

}
