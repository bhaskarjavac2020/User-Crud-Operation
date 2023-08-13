package com.bktech.security.serviceImple;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bktech.security.entity.Users;
import com.bktech.security.repository.UserRepository;
import com.bktech.security.service.IUserService;
@Service
public class UserServiceImple implements IUserService,UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Override
	public Integer saveUser(Users user) {
		//encode password before saving to DB
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		return userRepository.save(user).getId();
	}

	@Override
	public Optional<Users> findByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> opt=userRepository.findByUsername(username);
		User springUser=null;
		if(opt.isEmpty()) {
			throw new UsernameNotFoundException("User with username "+username+" is not found.");
		}else {
			Users user=opt.get();
			Set<String> roles=user.getRoles();
			Set<GrantedAuthority> ga=new HashSet<>();
			for(String role:roles) {
				ga.add(new SimpleGrantedAuthority(role));
			}
			springUser=new User(username, user.getPassword(), ga);
		}
		return springUser;
	}

}
