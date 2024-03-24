package com.example.menu_recommend.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.menu_recommend.dto.response.ResponseDto;
import com.example.menu_recommend.dto.response.choice.GetMenuRecommendResponseDto;
import com.example.menu_recommend.entity.MenuRecommendEntity;
import com.example.menu_recommend.repository.MenuRecommendRepository;
import com.example.menu_recommend.service.MeneRecommendService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuRecommendServiceImplement implements MeneRecommendService {

    private final MenuRecommendRepository menuRecommendRepository;
    
    @Override
    public ResponseEntity<? super GetMenuRecommendResponseDto> getMenu(String menuName) {

        MenuRecommendEntity menuRecommendEntity = null;

        try {

            menuRecommendEntity = menuRecommendRepository.getMenu(menuName);
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetMenuRecommendResponseDto.success(menuRecommendEntity);

    }
    
}
