package com.surya.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.surya.dto.Student;
import com.surya.factory.StudentServiceFactory;
import com.surya.service.IStudentService;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1.Add Student");
			System.out.println("2.Search Student");
			System.out.println("3.Update Student");
			System.out.println("4.Delete Student");
			System.out.println("5.EXIT");
			System.out.print("Your option [1,2,3,4,5] : ");
			int option = Integer.parseInt(br.readLine());

			String sid = "";
			String sname = "";
			String saddr = "";
			Student student = null;

			IStudentService studentService = null;
			String status = "";

			switch (option) {
			case 1:
				System.out.println("=============== ADD STUDENT MODULE ==============");
				System.out.print("Student Id       : ");
				sid = br.readLine();
				System.out.println("Student Name   : ");
				sname = br.readLine();
				System.out.println("Student Address:");
				saddr = br.readLine();

				student = new Student();
				student.setSid(sid);
				student.setSname(sname);
				student.setSaddr(saddr);

				studentService = StudentServiceFactory.getStudentService();
				status = studentService.addStudent(student);
				System.out.println(status);
				
				break;
 
			case 2:
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:
				System.out.println("*******************ThanQ for Using these Application");
				System.exit(0);
				break;

			default:
				System.out.println("Enter the option from 1,2,3,4 and 5");
				break;
			}
		}
	}
}
