package com.example.menu_recommend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.menu_recommend.repository.resultSet.GetMenuResultSet;

@Repository
public interface MenuRepository extends JpaRepository<MenuRepository, String> {
    
    @Query(
        value = 
        "SELECT menu_name " +
        "FROM menu " +
        "ORDER BY RAND() " +
        "LIMIT ?1; ",
        nativeQuery = true
    )
    GetMenuResultSet getMenu(int menuId);

}
