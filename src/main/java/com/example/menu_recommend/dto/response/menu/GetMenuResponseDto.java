package com.example.menu_recommend.dto.response.menu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.menu_recommend.common.ResponseCode;
import com.example.menu_recommend.common.ResponseMessage;
import com.example.menu_recommend.dto.response.ResponseDto;
import com.example.menu_recommend.repository.resultSet.GetMenuResultSet;

import lombok.Getter;

@Getter
public class GetMenuResponseDto extends ResponseDto {
    
    private int menuId;
    private String menuName;

    private GetMenuResponseDto(GetMenuResultSet resultSet) {
        super(ResponseCode.SUCCESS, ResponseMessage.SUCCESS);
        this.menuId = resultSet.getMenuId();
        this.menuName = resultSet.getMenuName();
    }

    public static ResponseEntity<GetMenuResponseDto> success(GetMenuResultSet resultSet) {
        GetMenuResponseDto result = new GetMenuResponseDto(resultSet);
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }

    public static ResponseEntity<ResponseDto> failed() {
        ResponseDto result = new ResponseDto(ResponseCode.FAILED, ResponseMessage.FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(result);
      }

}
