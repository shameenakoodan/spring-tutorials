package org.shameenakoodan.studentlogin.repository;

import org.shameenakoodan.studentlogin.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long>
{
 
  Role findByName(String name);
}

