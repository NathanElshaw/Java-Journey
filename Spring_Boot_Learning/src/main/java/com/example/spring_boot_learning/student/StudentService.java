package com.example.spring_boot_learning.student;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException(student.getEmail() + "is already in use!");
        }
        studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        boolean exist = studentRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("id " + id + "is not valid!");
        }
        studentRepository.deleteById(id);
    }

    @Transactional
    public void updateStudent(
            Long id,
            String name,
            String email
    ) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() ->
                        new IllegalStateException(
                                "Student with id " + id + " does not exist"
                        )
                );
        if (name != null &&
                name.length() > 0 &&
                !Objects.equals(student.getName(), name)) {
            student.setName(name);
        }
        if (email != null &&
                email.length() > 0 &&
                !Objects.equals(student.getEmail(), email)) {
            Optional<Student> optionalStudent = studentRepository.findStudentByEmail(email);
            if (optionalStudent.isPresent()) {
                throw new IllegalStateException("Email is already taken");
            } else {
                student.setEmail(email);
            }
        }
    }
}

