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
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "recommend")
@Table(name = "recommend")
public class RecommendEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recommendId;

    private String recommendUserId;

    private String recommendMenuId;

}
