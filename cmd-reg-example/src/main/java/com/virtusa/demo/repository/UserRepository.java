package com.virtusa.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
	
	User findByEmail(String email);
	
	@Query("Select u from USER u WHERE u.email= :email")
	public User getUserByUserEmail(@Param("email") String email);
}
