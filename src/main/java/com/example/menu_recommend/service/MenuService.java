package com.example.menu_recommend.service;

import org.springframework.http.ResponseEntity;

import com.example.menu_recommend.dto.response.menu.GetMenuResponseDto;

public interface MenuService {
    
    ResponseEntity<? super GetMenuResponseDto> getMenu();

}
