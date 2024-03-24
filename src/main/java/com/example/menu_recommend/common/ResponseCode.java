package com.example.menu_recommend.common;

public interface ResponseCode {
    
    public static final String SUCCESS = "SU";

    // Http status 400
    String VALIDATION_FAILED = "VF";
    
    // Http status 500
    String DATABASE_ERROR = "DE";
}
