package net.cardex.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.cardex.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
