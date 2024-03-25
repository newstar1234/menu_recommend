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

    @GetMapping("/{menuId}")
    public ResponseEntity<? super GetMenuResponseDto> getMenu(
        @PathVariable("menuId") Integer menuId
    ) {
        ResponseEntity<? super GetMenuResponseDto> response = menuService.getMenu(menuId);
        return response;
    }
    
}
