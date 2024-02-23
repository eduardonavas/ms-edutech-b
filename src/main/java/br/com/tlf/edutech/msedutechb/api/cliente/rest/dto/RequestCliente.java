package br.com.tlf.edutech.msedutechb.api.cliente.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestCliente {
    private Customer customer;
    private Product product;
}
