package com.mandeyya.mafuzfleet.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.mandeyya.mafuzfleet.models.User;
import com.mandeyya.mafuzfleet.models.UserPrincipal;
import com.mandeyya.mafuzfleet.models.User;
import com.mandeyya.mafuzfleet.repositories.UserRepository;

public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired UserRepository  userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("User not found!");
		}
 
		return new UserPrincipal(user);
	}

}
