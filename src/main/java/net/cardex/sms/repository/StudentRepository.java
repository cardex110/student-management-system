package net.cardex.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.cardex.sms.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{

}
