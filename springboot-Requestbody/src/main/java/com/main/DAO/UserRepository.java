package com.main.DAO;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.main.entity.UserEntity;

//@Repository
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
	// Here is done by Jpa
	// In Student Repository same thisng done by Query.
	Optional<UserEntity>  findByIdAndUsertype(int id, String usertype);

	Optional< UserEntity>  findByUsernameAndPassword(String userName, String password);
	Optional<UserEntity> findByUsertype(String userType);
	
	@Query("from UserEntity u where u.usertype=:pUserType")
	List<UserEntity>   getAllUserByQuery(@Param("pUserType") String usertype);
}
