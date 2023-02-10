package com.leap.revise.controllers.implement;

import com.leap.revise.controllers.StudentController;
import com.leap.revise.entities.Student;
import com.leap.revise.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentControllerImplement implements StudentController {

    private final StudentService studentService;

    @Override
    public List<Student> findAll() {
        return this.studentService.findAll();
    }

    @Override
    public Student add(Student student) {
        return this.studentService.add(student);
    }

    @Override
    public Student update(Student student) {
        return this.studentService.update(student);
    }

    @Override
    public void delete(Long id) {
        this.studentService.delete(id);
    }

}
