package com.example.springbootmongo.Controller;

import com.example.springbootmongo.Model.Student;
import com.example.springbootmongo.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/")
    public ResponseEntity<?> addStudent(@RequestBody Student stud) {
        Student s = studentRepository.save(stud);
        return ResponseEntity.ok(s);
    }

    @GetMapping("/")
    public ResponseEntity<?> getStudent(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable("id") int id){
        studentRepository.deleteById(id);
        return ResponseEntity.ok(studentRepository.findAll());
    }

//    @PatchMapping("/student/{id}")
//    public ResponseEntity<?> patchStudent(@PathVariable("id") int id, @RequestBody Student s){
//        studentRepository.
//    }


}