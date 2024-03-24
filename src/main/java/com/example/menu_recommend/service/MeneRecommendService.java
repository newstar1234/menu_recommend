package com.example.menu_recommend.service;

import org.springframework.http.ResponseEntity;

import com.example.menu_recommend.dto.response.choice.GetMenuRecommendResponseDto;

public interface MeneRecommendService {
    
    ResponseEntity<? super GetMenuRecommendResponseDto> getMenu(String menuName);

}
