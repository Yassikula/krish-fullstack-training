package com.yasasi.demo.repository;

import com.yasasi.demo.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

public interface StudetRepository extends JpaRepository<Student,Integer> {


//     Student save(Student student);

}
