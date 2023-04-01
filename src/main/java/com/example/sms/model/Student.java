package com.example.sms.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column(name = "id_number", nullable = false)
    private long idNumber;
    @Column(name = "age", nullable = false)
    private Integer age;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "course", nullable = false)
    private String course;
}
