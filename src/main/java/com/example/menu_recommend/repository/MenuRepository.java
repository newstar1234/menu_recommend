package com.example.menu_recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.entity.MenuEntity;
import com.example.menu_recommend.repository.resultset.MenuResultSet;

@Repository
public interface MenuRepository extends JpaRepository<MenuEntity, Integer> {

   @Query(
    value = 
    "SELECT menu_name " +
    "FROM menu " +
    "WHERE menu_category = '?menu_category' " +
    "ORDER BY RAND() " +
    "LIMIT ?1; ",
    nativeQuery = true
   )
   MenuResultSet getMenu();

   MenuResultSet findRandomByMenuName();
    
}
