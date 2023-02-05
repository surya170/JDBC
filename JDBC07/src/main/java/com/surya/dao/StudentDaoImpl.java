package com.surya.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.surya.dto.Student;
import com.surya.factory.ConnectionFactory;

public class StudentDaoImpl implements IStudentDao {

	@Override
	public String add(Student student) {
		String status = "";
		try {
			Connection con  = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			Student std =  search(student.getSid());
            if(std == null) {
            	
            } else {
            	status = "Student Existed Already";
            }
		} catch (Exception e) {
		  e.printStackTrace();
		}

		return status;
	}

	@Override
	public Student search(String id) {
		Student student = null;
        try {
			Connection con = ConnectionFactory.getConnection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where SID = '"+id+"'");
			boolean b = rs.next();
			
			if(b == true) {
				student = new Student();
				student.setSid(rs.getString("SID"));
				student.setSname(rs.getString("SNAME"));
				student.setSaddr(rs.getString("SADDR"));
				
			}else{
				student = null;
			}
		} catch (Exception e) {
		    e.printStackTrace();	
		}
		return student;
	}

	@Override
	public String update(Student student) {

		return null;
	}

	@Override
	public String delete(String sid) {

		return null;
	}

}
