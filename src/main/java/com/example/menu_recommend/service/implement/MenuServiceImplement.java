package com.example.menu_recommend.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.menu_recommend.dto.response.ResponseDto;
import com.example.menu_recommend.dto.response.menu.GetMenuResponseDto;
import com.example.menu_recommend.repository.MenuRepository;
import com.example.menu_recommend.repository.resultSet.GetMenuResultSet;
import com.example.menu_recommend.service.MenuService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MenuServiceImplement implements MenuService {

    private final MenuRepository menuRepository;

    @Override
    public ResponseEntity<? super GetMenuResponseDto> getMenu(int menuId) {

        GetMenuResultSet resultSet = null;

        try {

            resultSet = menuRepository.getMenu(menuId);
            if(resultSet == null) return GetMenuResponseDto.failed();
            
        } catch (Exception exception) {
            exception.printStackTrace();
            return ResponseDto.databaseError();
        }

        return GetMenuResponseDto.success(resultSet);

    }
    
}
