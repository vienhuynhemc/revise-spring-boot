package com.leap.revise.services.implement;

import com.leap.revise.entities.Student;
import com.leap.revise.repositories.StudentRepository;
import com.leap.revise.services.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Transactional
    @Override
    public Student update(Student student) {
        Optional<Student> existsStudent = this.studentRepository.findById(student.getId());
        if (existsStudent.isPresent()) {
            Student studentFromOptional = existsStudent.get();
            studentFromOptional.setEmail(student.getEmail());
            studentFromOptional.setName(student.getName());
            studentFromOptional.setDob(student.getDob());
            return studentFromOptional;
        } else {
            throw new IllegalStateException("Can not find student by id: " + student.getId());
        }
    }

    @Override
    public void delete(Long id) {
        Optional<Student> student = this.studentRepository.findById(id);
        if (student.isPresent()) {
            this.studentRepository.deleteById(id);
        } else {
            throw new IllegalStateException("Can not find student by id: " + id);
        }
    }

}
