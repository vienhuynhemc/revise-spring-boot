package com.leap.revise.controllers;

import com.leap.revise.entities.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "students")
public interface StudentController {

    @GetMapping
    List<Student> findAll();

    @PostMapping
    Student add(@RequestBody Student student);

    @PutMapping
    Student update(@RequestBody Student student);

    @DeleteMapping(path = "/{id}")
    void delete(@PathVariable Long id);

}
