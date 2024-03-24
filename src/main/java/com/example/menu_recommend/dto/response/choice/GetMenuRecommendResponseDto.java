package com.example.menu_recommend.dto.response.choice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.menu_recommend.dto.response.ResponseDto;
import com.example.menu_recommend.entity.MenuRecommendEntity;

import lombok.Getter;

@Getter
public class GetMenuRecommendResponseDto extends ResponseDto {

    private int menuId;
    private String menuName;

    private GetMenuRecommendResponseDto(MenuRecommendEntity menuRecommendEntity) {
        this.menuId = menuRecommendEntity.getMenuId();
        this.menuName = menuRecommendEntity.getMenuName();
    }

    public static ResponseEntity<GetMenuRecommendResponseDto> success(MenuRecommendEntity menuRecommendEntit) {
        GetMenuRecommendResponseDto result = new GetMenuRecommendResponseDto(menuRecommendEntit);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

}
