package com.surya.service;

import com.surya.dao.IStudentDao;
import com.surya.dto.Student;
import com.surya.factory.StudentDaoFactory;

public class StudentServiceImpl implements IStudentService {

	@Override
	public String addStudent(Student student) {
		IStudentDao studentDao = StudentDaoFactory.getStudentDao();
		String status = studentDao.add(student);
		return status;
	}

	@Override
	public Student searchStudent(String sid) {
			return null;
	}

	@Override
	public String updateStudent(Student student) {
		return null;
	}

	@Override
	public String deleteStudent(String sid) {	
		return null;
	}

}
