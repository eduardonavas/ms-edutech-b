package br.com.tlf.edutech.msedutechb.api.cliente.rest;

import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.RequestCliente;
import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.ResponseCliente;
import br.com.tlf.edutech.msedutechb.core.port.in.ClienteUserCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteApiController implements ClienteApi{

    @Autowired
    private ClienteUserCase clienteUserCase;

    @Override
    public ResponseCliente cad(RequestCliente requestCliente) {
        return clienteUserCase.cad(requestCliente);
    }
}
