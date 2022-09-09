package com.table.Repository;

import com.table.DAO.PostDAO;
import com.table.Dto.PostDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PostRepository extends JpaRepository<PostDAO,Integer> {
}
