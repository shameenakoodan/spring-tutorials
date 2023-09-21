package org.shameenakoodan.studentlogin.service;

import java.util.List;

import org.shameenakoodan.studentlogin.dto.StudentDTO;
import org.shameenakoodan.studentlogin.model.Student;

public interface StudentService {
   void saveStudent(StudentDTO studentDto);
   Student findStudentByEmail(String email);
   List<StudentDTO> findAllStudents();
}
