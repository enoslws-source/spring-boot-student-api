package com.student.student;

import com.student.student.entities.Student;
import com.student.student.dao.StudentRepository;
import com.student.student.services.StudentImplement;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentImplement studentService;

    @Test
    void getAllStudents_returnAllStudents(){
        Student student1 = new Student();
        student1.setFirstName("Enos");
        student1.setLastName("Lewis");
        student1.setGrade(12);
        student1.setGpa(4.7);

        Student student2 = new Student();
        student2.setFirstName("Daniel");
        student2.setLastName("Lewis");
        student2.setGrade(10);
        student2.setGpa(2.9);

        when(studentRepository.findAll()).thenReturn(Arrays.asList(student1, student2));

        List<Student> result = studentService.findAll();

        assertEquals(2, result.size());

    }
}
