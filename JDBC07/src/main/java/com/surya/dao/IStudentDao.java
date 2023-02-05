package com.surya.dao;

import com.surya.dto.Student;

public interface IStudentDao {
    public String add(Student student);
    public Student search(String id);
    public String update(Student student);
    public String delete(String sid);
}
