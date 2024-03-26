package com.example.menu_recommend.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.menu_recommend.entity.MenuEntity;
import com.example.menu_recommend.entity.UserEntity;
import com.example.menu_recommend.repository.MenuRepository;
import com.example.menu_recommend.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuService {
    
    private final MenuRepository menuRepository;
    private final UserRepository userRepository;

    private static final int maxMenuId = 100;
    private static final int minMenuId = 1;

    public List<MenuEntity> getRandomMenu() {

        int randomMenuId = (int) (Math.random() * (maxMenuId - minMenuId + 1)) + minMenuId;

        MenuEntity menuEntity = menuRepository.findById(randomMenuId).orElse(null);

        if(menuEntity != null) {
            List<MenuEntity> menuList = new ArrayList<>();
            menuList.add(menuEntity);
            return menuList;
        }
        return Collections.emptyList();

    }

    public List<MenuEntity> getRecommendMenu(int userId) {

        UserEntity userEntity = userRepository.findById(userId).orElse(null);

        List<MenuEntity> menuList = menuRepository.findByMenuCategory(userEntity.getUserCategory());

        return menuList;
    }

}
