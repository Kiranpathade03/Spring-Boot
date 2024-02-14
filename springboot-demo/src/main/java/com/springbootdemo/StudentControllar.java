package com.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentControllar {
    @GetMapping("/student")
   public Student getStudent(){

        return new Student("ramesh","pathade");
   }

   @GetMapping("/students")
   public  List<Student> getStudents(){
       List<Student> students = new ArrayList<>();

       students.add(new Student("Kiran","pathade"));
       students.add(new Student("shubham","more"));
       students.add(new Student("abhishek","wable"));
       students.add(new Student("yogesh","wakchaure"));
       return  students;
   }
}
