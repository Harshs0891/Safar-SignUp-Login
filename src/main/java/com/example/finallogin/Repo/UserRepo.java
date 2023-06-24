package com.example.finallogin.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.finallogin.Entity.User;


@EnableJpaRepositories
@Repository
public interface UserRepo extends JpaRepository<User,Long>{
    
    Optional<User> findOneByUsernameAndPassword(String username, String password);
    User findByUsername(String username);
    User findByPassword(String password);
    User findByEmail(String email);
}
