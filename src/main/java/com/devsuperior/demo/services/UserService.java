package com.devsuperior.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.devsuperior.demo.entities.Role;
import com.devsuperior.demo.entities.User;
import com.devsuperior.demo.projections.UserDetailsProjection;
import com.devsuperior.demo.repositories.RoleRepository;
import com.devsuperior.demo.repositories.UserRepository;



@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RoleRepository roleRepository;
	

// busca no banco de dados um usuario que chegou como parametro	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<UserDetailsProjection> result = repository.searchUserAndRolesByEmail(username);
		if (result.size() == 0) {
			throw new UsernameNotFoundException("User not found");
		}
// salvo um usuario com os dados da projection	
		
		User user = new User();
		user.setEmail(username);
		user.setPassword(result.get(0).getPassword());
		
/* tenho que pegar os Role também
 * pois um usuario está associado ao um role 
 * para cada elemento da minha lista result faço os gets
 */		
		for(UserDetailsProjection projection : result) {
			user.addRole(new Role(projection.getRoleId(), projection.getAuthority()));
		}
		return user;
	}
	
}
