package com.example.compile.Repository;

import com.example.compile.DAO.StudentDao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentDao,Integer> {
}
