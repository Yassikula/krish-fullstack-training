package com.yasasi.demo.service;

import com.yasasi.demo.model.Student;
import com.yasasi.demo.repository.StudetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl  implements StudentService{

@Autowired
    StudetRepository studetRepository;

    public Student save (Student student){

       return studetRepository.save(student);

    }

    public Student fetchStudentById(int id) {
        Optional<Student> student = studetRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }
}
