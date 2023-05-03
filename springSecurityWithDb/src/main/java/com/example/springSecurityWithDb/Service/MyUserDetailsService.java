package com.example.springSecurityWithDb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springSecurityWithDb.Repository.MyUserRepository;
import com.example.springSecurityWithDb.model.MyUser;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	MyUserRepository myUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return myUserRepository.findByEmail(username);
	}
	
	public void createUser(MyUser myUser) {
		myUserRepository.save(myUser);
	}
}
