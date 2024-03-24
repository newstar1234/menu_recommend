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
@Entity(name = "korea_food")
@Table(name = "korea_food")
public class KoreaFoodEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int koreaId;

    private String koreaMenu;

}
