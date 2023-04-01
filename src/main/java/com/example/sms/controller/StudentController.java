package com.example.sms.controller;

import com.example.sms.model.Student;
import com.example.sms.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Student create REST API
    @PostMapping()
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }

    // Get all students REST API
    @GetMapping()
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    // REST API to get student by id
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long id){
        return new ResponseEntity<Student>(studentService.getStudentById(id), HttpStatus.OK);
    }
}
