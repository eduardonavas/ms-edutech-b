package br.com.tlf.edutech.msedutechb.core.application.service;

import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.RequestCliente;
import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.ResponseCliente;
import br.com.tlf.edutech.msedutechb.core.port.in.ClienteUserCase;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ClienteUserCaseImpl implements ClienteUserCase {


    @Override
    public ResponseCliente cad(RequestCliente requestCliente) {
        log.info("Request: {}", requestCliente);
        if("pos".equals(requestCliente.getProduct().getType())){
            throw new RuntimeException("o tipo  de produto " + requestCliente.getProduct().getType() + " não é suportado");
        }
        return ResponseCliente.builder().id(UUID.randomUUID().toString()).build();
    }
}
