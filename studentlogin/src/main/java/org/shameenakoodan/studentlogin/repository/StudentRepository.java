package org.shameenakoodan.studentlogin.repository;

import org.shameenakoodan.studentlogin.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long>
{
 
  Student findByEmail(String email);
}

