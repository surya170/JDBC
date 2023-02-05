package com.surya.service;

import com.surya.dto.Student;

public interface IStudentService {
	 public String addStudent(Student student);
     public Student searchStudent(String sid);
     public String updateStudent(Student student);
     public String deleteStudent(String sid);
}
