package com.example.DbDemo.Controllers;

import com.example.DbDemo.Modals.StudentEntity;
import com.example.DbDemo.Repository.StudentRepo;
import com.example.DbDemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService service;
    @PostMapping("/add")
    public String add(@RequestBody StudentEntity student){
       return service.add(student);
    }
    @GetMapping("/get/{id}")
    public StudentEntity get(@PathVariable("id") int id){
        return service.get(id);
    }
    @PutMapping("/update")
    public StudentEntity update(@RequestParam int id,
                                @RequestParam int age){
        StudentEntity student = service.update(id,age);
        return student;
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        return service.delete(id);
    }
    @GetMapping("/all")
    public List<StudentEntity> getAll(){
        return service.getAll();
    }

}
