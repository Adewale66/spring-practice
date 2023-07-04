package com.springpractice.springpractice.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    public List<Student> getStudents(){
        return  List.of(
                new Student(
                        1L, "Wale",21, LocalDate.of(2000, Month.JANUARY, 4),"wale@test.com"
                )
        );
    }
}
