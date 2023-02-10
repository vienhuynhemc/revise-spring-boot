package com.leap.revise.configurations;

import com.leap.revise.entities.Student;
import com.leap.revise.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    public CommandLineRunner initStudent(StudentRepository studentRepository) {
        return args -> studentRepository.saveAll(
                List.of(new Student(
                                "Vien",
                                "vienhuynhemc@gmail.com",
                                LocalDate.of(1995, Month.MAY, 4)),
                        new Student(
                                "Vien",
                                "vienhuynhemc@gmail.com",
                                LocalDate.of(2000, Month.MAY, 4)
                        )
                ));
    }

}
