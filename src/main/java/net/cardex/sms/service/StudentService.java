package net.cardex.sms.service;

import java.util.List;

import net.cardex.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student updateStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student deleteStudentById(Long id);
}
