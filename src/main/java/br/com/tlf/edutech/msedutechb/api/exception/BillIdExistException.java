package br.com.tlf.edutech.msedutechb.api.exception;

public class BillIdExistException extends RuntimeException{

    public BillIdExistException(String message){
        super(message);
    }
}
