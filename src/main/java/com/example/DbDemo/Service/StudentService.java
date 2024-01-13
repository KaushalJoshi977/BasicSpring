package com.example.DbDemo.Service;

import com.example.DbDemo.Modals.StudentEntity;
import com.example.DbDemo.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public String add(StudentEntity student){
        repo.save(student);
        return "student added";
    }

    public StudentEntity update(int id, int age) {
        StudentEntity student = repo.findById(id).get();
        student.setAge(age);
        repo.save(student);
        return student;
    }

    public StudentEntity get(int id) {
        return repo.findById(id).get();
    }
    public String delete(int id) {
        repo.deleteById(id);
        return "student deleted";
    }

    public List<StudentEntity> getAll() {
        return repo.findAll();
    }
}
