package com.example.Crud;

import com.example.user.user.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface CrudRepository extends JpaRepository<CrudDao,Integer> {
    Optional<CrudDao> findById(Integer crud_id);


}
