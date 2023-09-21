package org.shameenakoodan.SpringSecurityRegDemo.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;


import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.shameenakoodan.SpringSecurityRegDemo.dto.UserDTO;
import org.shameenakoodan.SpringSecurityRegDemo.model.Role;
import org.shameenakoodan.SpringSecurityRegDemo.model.User;
import org.shameenakoodan.SpringSecurityRegDemo.repository.UserRepository;
import org.shameenakoodan.SpringSecurityRegDemo.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
* @implNote
* UserPrincipal class which implements UserDetails interface.
* This way you get more flexibility and control over user authorization and authentication process.
*/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

	   @Autowired
	   private UserRepository userRepository;

	   @Autowired
	   private RoleService roleService;

	   @Autowired
	   private BCryptPasswordEncoder encoder;

	   @Override
	   @Transactional
	   public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	       User user = userRepository.findUserByUserName(userName);
	       log.debug(userName);
	       if (user == null) {
	           log.warn("Invalid username or password {}", userName);

	           throw new UsernameNotFoundException("Invalid username or password.");
	       }
	      /* return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),   mapRolesToAuthorities(user.getRoles()));*/
	       return new UserPrincipal(user, roleService.getRolesByUser(user.getId()));
	   }

	   private Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles) {
	       return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	   }


	   /** Using model mapper helps to avoid extra coding
	    * @param userDTO
	    */
	   @Override
	@Transactional
	   public void creat(UserDTO userDTO)
	   {
	       ModelMapper modelMapper = new ModelMapper();
	       modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	       User user = modelMapper.map(userDTO, User.class);

	       user.setPassword(encoder.encode(user.getPassword()));
		   //Adds the roles for the user when creating the user
	       user.setRoles(Arrays.asList(roleService.findRoleByRoleName("ROLE_USER")));

	       userRepository.save(user);
	   }

	   /**    * In this example login and email has the same values @param email @return
	    */
	   @Override
	public User findUserByEmail(String email)
	   {
	       return userRepository.findUserByEmail(email);
	   }

	   @Override
	public User findUserByName(String name)
	   {
	       return userRepository.findUserByUserName(name);
	   }

}
