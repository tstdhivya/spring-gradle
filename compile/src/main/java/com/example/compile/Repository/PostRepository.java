package com.example.compile.Repository;

import com.example.compile.DAO.PostDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends JpaRepository<PostDAO,Integer> {
}
