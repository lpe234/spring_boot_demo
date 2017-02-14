package com.example.repository;

import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 * Created by lpe234 on 2017/2/15.
 */

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("from User u where u.id=:id")
    User findUser(@Param("id") Long id);
}
