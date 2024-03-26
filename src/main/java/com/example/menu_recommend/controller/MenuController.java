package com.example.menu_recommend.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu_recommend.entity.MenuEntity;
import com.example.menu_recommend.service.MenuService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/v1/menu")
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/random-menu")
    public List<MenuEntity> getRandomMenu() {
        return menuService.getRandomMenu();
    }

}
