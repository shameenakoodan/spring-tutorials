package org.shameenakoodan.SpringSecurityRegDemo.service;

import java.util.List;

import org.shameenakoodan.SpringSecurityRegDemo.model.Role;

public interface RoleService {
	public void saveRole(Role role);
	public Role findRoleByRoleName(String name);
	public List<Role> getAllRoles();
	public List<Role> getRolesByUser(long id);

}
