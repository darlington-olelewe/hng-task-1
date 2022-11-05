package com.hngintern.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchOperationException.class)
    public ResponseEntity<?> handleNoSuchOperaitonEx(NoSuchOperationException ex, WebRequest request){
        ApiErrorDetail errorDetail = new ApiErrorDetail(ex.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetail,HttpStatus.BAD_REQUEST);
    }

}

