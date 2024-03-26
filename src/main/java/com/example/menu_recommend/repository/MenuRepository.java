package com.example.menu_recommend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.entity.MenuEntity;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {
    
    List<MenuEntity> findByMenuCategory(String menuCategory);

    MenuEntity findMaxMenuId(int menuId);
    MenuEntity findMinMenuId(int menuId);
    
}
