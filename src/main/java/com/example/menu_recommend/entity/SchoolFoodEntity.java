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
@Entity(name = "school_food")
@Table(name = "school_food")
public class SchoolFoodEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schoolId;

    private String schoolMenu;

}
