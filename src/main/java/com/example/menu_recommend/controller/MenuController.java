package com.example.menu_recommend.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu_recommend.dto.response.menu.GetMenuResponseDto;
import com.example.menu_recommend.service.MenuService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/menu")
@RequiredArgsConstructor
public class MenuController {
    
    private final MenuService menuService;

    @GetMapping("/")
    public ResponseEntity<? super GetMenuResponseDto> getMenu (
    ) {
        ResponseEntity<? super GetMenuResponseDto> response = menuService.getMenu();
        return response;
    }

}
