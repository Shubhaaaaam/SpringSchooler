package com.example.SpringSchooler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringSchooler.entity.Student;
import com.example.SpringSchooler.repository.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Student existing = getStudentById(id);
        existing.setName(student.getName());
        existing.setEmail(student.getEmail());
        existing.setCourse(student.getCourse());
        return repository.save(existing);
    }

    @Override
    public void deleteStudent(Long id) {
        repository.deleteById(id);
    }
}
