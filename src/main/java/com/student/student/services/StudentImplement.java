package com.student.student.services;

import com.student.student.dao.StudentRepository;
import com.student.student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentImplement implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentImplement(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Optional<Student> findById(long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student save(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    @Override
    public Student update(long id, Student student){
        Student student1 = studentRepository.findById(id).orElseThrow();
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setGrade(student.getGrade());
        student1.setGpa(student.getGpa());

        return studentRepository.save(student1);
    }

    @Override
    public void delete(long id) {
        studentRepository.deleteById(id);
    }
}
