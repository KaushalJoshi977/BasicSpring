package com.example.DbDemo.Repository;

import com.example.DbDemo.Modals.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {
}
