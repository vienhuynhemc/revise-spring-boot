package com.leap.revise.services.implement;

import com.leap.revise.entities.Student;
import com.leap.revise.repositories.StudentRepository;
import com.leap.revise.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImplement implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student add(Student student) {
        return this.studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        return null;
    }

    @Override
    public Student delete(Long id) {
        return null;
    }

}
