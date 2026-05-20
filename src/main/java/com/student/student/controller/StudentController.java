package com.student.student.controller;

import com.student.student.entities.Student;
import com.student.student.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")

public class StudentController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable long id){
        return studentService.findById(id);
    }
    @GetMapping
    public List<Student> findAll(){
        return studentService.findAll();
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable long id, @RequestBody Student student){
        return studentService.update(id, student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        studentService.delete(id);
    }
}
