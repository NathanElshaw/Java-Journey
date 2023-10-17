package com.example.spring_boot_learning.student;
 
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents() {
        return List.of(new Student(
                1L,
                "Mario",
                "Mario.J@gmail.com",
                LocalDate.of(2001, Month.AUGUST, 5),
                22
        ));
    }
}

