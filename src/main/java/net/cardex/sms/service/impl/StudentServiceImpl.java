package net.cardex.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.cardex.sms.entity.Student;
import net.cardex.sms.service.StudentService;
import net.cardex.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}
	
	@Override
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	@Override 
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		return null;
	}
	
	

}
