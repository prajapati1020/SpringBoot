package com.example.demo.error;

import com.example.demo.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestResponseEntityExeptionHandler
        extends ResponseEntityExceptionHandler {
 @ExceptionHandler(EmployeeNotFounExcep.class)
 @ResponseBody
 @ResponseStatus(HttpStatus.NOT_FOUND)
 public ErrorMessage employeeNotFoundHandler(EmployeeNotFounExcep exception){
     ErrorMessage message =new ErrorMessage(exception.getMessage(), HttpStatus.NOT_FOUND);
     return message;

 }

    @ExceptionHandler(Exception.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorMessage genericExceptionHandler(Exception exception){
        ErrorMessage message =new ErrorMessage(exception.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        return message;

    }


}
