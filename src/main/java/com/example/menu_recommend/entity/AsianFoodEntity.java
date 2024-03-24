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
@Entity(name = "asian_food")
@Table(name = "asian_food")
public class AsianFoodEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int asianId;

    private String asianMenu;

}
