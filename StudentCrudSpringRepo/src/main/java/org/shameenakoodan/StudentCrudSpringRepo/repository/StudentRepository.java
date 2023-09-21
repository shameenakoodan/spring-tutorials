package org.shameenakoodan.StudentCrudSpringRepo.repository;

import java.util.List;

import org.shameenakoodan.StudentCrudSpringRepo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	 // following are custom methods
	   Student findByAccountNo (Long accountNo) ;
	   List<Student> findByNameContaining(String name);
}
