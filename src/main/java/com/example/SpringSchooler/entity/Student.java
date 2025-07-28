package com.example.SpringSchooler.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data // Lombok: generates getter/setters
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String course;
}
