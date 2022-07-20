package com.yasasi.demo.service;

import com.yasasi.demo.model.Student;

public interface StudentService {
    Student save(Student student);
    public Student fetchStudentById(int id);

}
