package com.surya.factory;

import com.surya.service.IStudentService;
import com.surya.service.StudentServiceImpl;

public class StudentServiceFactory {

	private static IStudentService studentService = null;
    static {
    	studentService = new StudentServiceImpl();
    }
    public static IStudentService getStudentService() {
    	return studentService;
    }
}
