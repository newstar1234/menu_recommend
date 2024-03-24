package com.example.menu_recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.dto.response.choice.GetMenuRecommendResponseDto;
import com.example.menu_recommend.entity.MenuRecommendEntity;


@Repository
public interface MenuRecommendRepository extends JpaRepository<MenuRecommendEntity, Integer>{
    
    @Query(
        value = 
        "SELECT menu_name " +
        "FROM menu_recommend " +
        "ORDER BY RAND() " +
        "LIMIT ?1; ",
        nativeQuery = true
    )
    MenuRecommendEntity getMenu(String menuName);
}
