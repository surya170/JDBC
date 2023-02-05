package com.surya.factory;

import com.surya.dao.IStudentDao;
import com.surya.dao.StudentDaoImpl;

public class StudentDaoFactory {
	
	private static IStudentDao studentDao = null;
	static {
		studentDao = new StudentDaoImpl();
	}
	public static IStudentDao getStudentDao() {
		return studentDao;
	}
  
}
