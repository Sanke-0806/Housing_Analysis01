package com.example.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.User;

public interface UserRepository extends JpaRepository <User , Integer >{

}
