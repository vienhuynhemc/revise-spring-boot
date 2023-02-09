package com.leap.revise.services;

import com.leap.revise.entities.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student add(Student student);

    Student update(Student student);

    Student delete(Long id);
}
