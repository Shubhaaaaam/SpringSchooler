package com.example.SpringSchooler.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringSchooler.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
