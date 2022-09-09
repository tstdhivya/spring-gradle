package com.example.compile.Repository;

import com.example.compile.DAO.TeacherDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<TeacherDao,Integer> {
}
