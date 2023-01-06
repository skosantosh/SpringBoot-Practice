package com.main.DAO;

import java.util.List;
import java.util.Optional;

//@Repository
//@Query
//@Param
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.main.entity.StudentEntity;

@Repository

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {

	// Using Query
	// In User Repository same thisng done by JPA.
	@Query("from StudentEntity s where s.id=:pId and s.usertype=:pUserType")
	Optional<StudentEntity> getAllStudentByQuery(@Param("pId") int id, @Param("pUserType") String usertype);

	@Query("from StudentEntity s where s.usertype=:pUserType")
	List<StudentEntity> getAllStudentByQuery(@Param("pUserType") String usertype);

	// using Optional instade directly retuening Class.
	/* StudentEntity findByUsernameAndPassword(String userName, String password); */
	Optional<StudentEntity> findByUsernameAndPassword(String userName, String password);

	Optional<StudentEntity> findByUsertype(String userType);

}
