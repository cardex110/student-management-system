package net.cardex.sms.service;

import java.util.List;

import net.cardex.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
}
