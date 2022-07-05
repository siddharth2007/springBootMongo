package com.example.springbootmongo.Repository;

import com.example.springbootmongo.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {



}
