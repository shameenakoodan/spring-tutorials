package org.shameenakoodan.SpringSecurityRegDemo.security;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.shameenakoodan.SpringSecurityRegDemo.model.Role;
import org.shameenakoodan.SpringSecurityRegDemo.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
public class UserPrincipal implements UserDetails {
	private User user;
	   private List<Role> roles;
	   public UserPrincipal(User user, List<Role> roles) {
	       super();
	       this.user = user;
	       this.roles = roles;
	   }
	   @Override
	   public Collection<? extends GrantedAuthority> getAuthorities() {
	       return roles.stream().map(role -> new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList());
	   }

	   @Override
	   public String getPassword() {
		   return this.user.getPassword();
	   }

	   @Override
	   public String getUsername() {
		   //System.out.println("password" + this.user.getUserName());
		   return this.user.getUserName();
	   }

	   @Override
	   public boolean isAccountNonExpired() {
	       return true;
	   }
	   @Override
	   public boolean isAccountNonLocked() {
	       return true;
	   }

	   @Override
	   public boolean isCredentialsNonExpired() {
	       return true;
	   }

	   @Override
	   public boolean isEnabled() {
	       return true;
	   }


}