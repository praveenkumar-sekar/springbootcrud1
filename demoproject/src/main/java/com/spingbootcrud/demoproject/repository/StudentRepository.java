package com.spingbootcrud.demoproject.repository;

import com.spingbootcrud.demoproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
