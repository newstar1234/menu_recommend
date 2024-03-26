package com.example.menu_recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,  Integer> {
    
}
