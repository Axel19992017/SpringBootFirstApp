package edu.tecnasa.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import edu.tecnasa.dao.UserDao;
import edu.tecnasa.entities.ClainType;
import edu.tecnasa.entities.User;

@Service
public class UserServiceImpl implements UserDetailsService{
	
	@Inject
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User currentUser = userDao.findByUserName(username);
		if(currentUser == null) {
			throw new UsernameNotFoundException("User not found!");
			
		}
		List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
		if(currentUser.getClaim() != null) {
			for (ClainType clainType: currentUser.getClaim()) {
				grantedAuthorities.add(new SimpleGrantedAuthority(clainType.getClainType()));
			}
		}
		UserDetails user = new org.springframework.security.core.userdetails.User(username, currentUser.getPassword(), grantedAuthorities);
				
		return user;
	}}
