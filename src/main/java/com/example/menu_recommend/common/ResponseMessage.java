package com.example.menu_recommend.common;

public interface ResponseMessage {
    
    public static final String SUCCESS = "Success";
    
    // Http status 400
    String VALIDATION_FAILED = "Validation failed";
    
    // Http status 500
    String DATABASE_ERROR = "Database Error";
}
