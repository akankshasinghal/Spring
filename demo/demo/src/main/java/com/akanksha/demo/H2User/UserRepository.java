package com.akanksha.demo.H2User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akanksha.demo.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer>{


    
}
