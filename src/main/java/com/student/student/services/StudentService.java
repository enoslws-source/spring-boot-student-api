package com.student.student.services;

import com.student.student.dao.StudentRepository;
import com.student.student.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public Optional<Student> findById(long id);
    public Student save(Student student);
    public List<Student> findAll();
    public Student update(long id, Student student);
    public void delete(long id);

}
