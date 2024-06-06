package br.com.tlf.edutech.msedutechb.api.exception;

import br.com.tlf.edutech.msedutechb.api.exception.dto.CustomError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CustomException {


    @ExceptionHandler(BillIdExistException.class)
    public ResponseEntity<CustomError> excep(BillIdExistException e){
        var error = CustomError.builder().status(HttpStatus.FORBIDDEN.value()).message(e.getMessage()).build();

        return ResponseEntity.status(error.getStatus()).body(error);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<CustomError> excep(RuntimeException e){
        var error = CustomError.builder().status(HttpStatus.INTERNAL_SERVER_ERROR.value()).message(e.getMessage()).build();

        return ResponseEntity.status(error.getStatus()).body(error);
    }
}
