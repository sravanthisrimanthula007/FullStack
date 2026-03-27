package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
	private final StudentRepository repo;

	public StudentService(StudentRepository repo) {
		this.repo = repo;
	}
	public List<student> getStudentByDepartment(String dept){
		return repo.findByDepartment(dept);
	}
	public List<student> getStudentByAge(int age){
		return repo.findByAge(age);
	}
	public List<student> getStudentGreaterThan(int age){
		return repo.findByAgeGreaterThan(age);
	}
	public List<student> getByDepartmentAndAge(String dept,int age){
		return repo.findByDepartmentAndAge(dept, age);
	}
}

