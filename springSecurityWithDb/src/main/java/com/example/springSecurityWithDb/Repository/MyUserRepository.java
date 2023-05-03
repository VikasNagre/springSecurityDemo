package com.example.springSecurityWithDb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springSecurityWithDb.model.MyUser;

@Repository
public interface MyUserRepository extends JpaRepository<MyUser, Integer> {
	MyUser findByEmail(String email);
}
