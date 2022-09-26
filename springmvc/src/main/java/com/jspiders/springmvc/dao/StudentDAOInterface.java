package com.jspiders.springmvc.dao;

import java.util.List;

import com.jspiders.springmvc.dto.StudentDTO;

public interface StudentDAOInterface {

	void addStudent(String name, String email, String userName, String password);

	StudentDTO login(String userName, String password);

	List<StudentDTO> viewAllStudents();
}
