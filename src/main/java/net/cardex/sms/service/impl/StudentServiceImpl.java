package net.cardex.sms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.cardex.sms.entity.Student;
import net.cardex.sms.service.StudentService;
import net.cardex.sms.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{

	private StudentRepository studentRepository;
	
	public StudentServiceImpl(net.cardex.sms.repository.StudentRepository studentRepository) {
		super();
		studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

}
