package com.example.menu_recommend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "menu_recommend")
@Table(name = "menu_recommend")
public class MenuRecommendEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;

    private String menuName;
    
}
