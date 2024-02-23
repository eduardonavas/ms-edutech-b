package br.com.tlf.edutech.msedutechb.api.cliente.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer {
    private String name;
    private int age;
    private String phoneNumber;
    private String  email;
}
