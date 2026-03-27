package com.example.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.student;
public interface StudentRepository extends JpaRepository<student,Integer>{
	List<student>findByDepartment(String department);
	List<student>findByAge(int age);
	List<student>findByAgeGreaterThan(int age);
	List<student>findByDepartmentAndAge(String department,int age);
}
