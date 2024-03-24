package com.example.menu_recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.entity.JapanFoodEntity;

@Repository
public interface JapanFoodRepository extends JpaRepository<JapanFoodEntity, Integer> {
    
}
