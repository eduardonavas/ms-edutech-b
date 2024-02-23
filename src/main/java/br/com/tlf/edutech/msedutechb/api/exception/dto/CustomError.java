package br.com.tlf.edutech.msedutechb.api.exception.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomError {
    private int status;
    private String message;

}
