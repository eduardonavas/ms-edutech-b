package br.com.tlf.edutech.msedutechb.api.cliente.rest;

import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.RequestCliente;
import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.ResponseCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface ClienteApi {

    @PostMapping("/cad")
    ResponseCliente cad(@RequestBody  RequestCliente requestCliente);


}
