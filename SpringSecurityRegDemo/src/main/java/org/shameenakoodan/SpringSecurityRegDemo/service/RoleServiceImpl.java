package org.shameenakoodan.SpringSecurityRegDemo.service;

import java.util.List;

import org.shameenakoodan.SpringSecurityRegDemo.model.Role;
import org.shameenakoodan.SpringSecurityRegDemo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class RoleServiceImpl implements RoleService{
	private RoleRepository roleRepository;

	   @Autowired
	   public RoleServiceImpl(RoleRepository roleRepository) {
	       this.roleRepository = roleRepository;
	   }

	   @Override
	   @Transactional
	   public void saveRole(Role role) {
	       roleRepository.save(role);
	   }

	   @Override
	   @Transactional
	   public Role findRoleByRoleName(String name) {
	       return roleRepository.findRoleByName(name);
	   }

	   @Override
	   public List<Role> getAllRoles() {
	       return roleRepository.findAll();
	   }
	   @Override
	   public List<Role> getRolesByUser(long id) {
	       return roleRepository.findRoleByUser(id);
	   }

}
