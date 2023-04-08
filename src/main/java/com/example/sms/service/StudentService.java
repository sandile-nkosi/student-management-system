package com.example.sms.service;

import com.example.sms.model.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();

    Student getStudentById(long id);

    Student updateStudent(Student student, long id);

    void deleteEmployee(long id);

}
