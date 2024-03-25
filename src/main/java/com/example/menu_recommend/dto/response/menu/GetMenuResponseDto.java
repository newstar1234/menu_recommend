package com.example.menu_recommend.dto.response.menu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.menu_recommend.common.ResponseCode;
import com.example.menu_recommend.common.ResponseMessage;
import com.example.menu_recommend.dto.response.ResponseDto;
import com.example.menu_recommend.repository.resultset.MenuResultSet;

import lombok.Getter;

@Getter
public class GetMenuResponseDto extends ResponseDto {

    private int menuId;
    private String menuCategory;
    private String menuName;
    
    private GetMenuResponseDto(MenuResultSet menuResultSet) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.menuId = menuResultSet.getMenuId();
        this.menuCategory = menuResultSet.getMenuCategory();
        this.menuName = menuResultSet.getMenuName();
    }

    public static ResponseEntity<GetMenuResponseDto> success(MenuResultSet menuResultSet) {
        GetMenuResponseDto result = new GetMenuResponseDto(menuResultSet);
        return ResponseEntity.status(HttpStatus.OK).body(result); 
    }

    public static ResponseEntity<ResponseDto> failed() {
        ResponseDto result = new ResponseDto();
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result); 
    }

}
