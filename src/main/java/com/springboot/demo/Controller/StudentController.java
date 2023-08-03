package com.springboot.demo.Controller;
import com.springboot.demo.bean.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Ramesh", "Datastore");
    }

    @GetMapping("students")
    public List<Student> getStudents()
    {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Datastore"));
        students.add(new Student("Tony", "Cena"));
        students.add(new Student("Sanjay", "Madhav"));
        students.add(new Student("Ram", "Madhav"));
        students.add(new Student("Umesh", "Datastore"));
        return students;

    }
    // http://localhost:8080/student/1
    // @PathVariable annotation
    @GetMapping("/student/{firstName}/{lastName}")
    public Student studentPathVariable(@PathVariable("firstName") String firstName, @PathVariable("lastName") String lastName){
        return new Student(firstName,lastName);
    }

    // build rest API to handle query parameters
    // http://localhost:8080/student/query?firstName=Ramesh&lastName=Fadatare
    @GetMapping("/student/query")
    public Student studentQueryParam(
            @RequestParam(name = "firstName") String firstName,
            @RequestParam(name = "lastName") String lastName) {
        return new Student(firstName, lastName);
    }
    


}
