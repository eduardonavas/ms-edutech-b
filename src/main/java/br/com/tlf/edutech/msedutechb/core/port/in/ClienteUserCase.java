package br.com.tlf.edutech.msedutechb.core.port.in;

import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.RequestCliente;
import br.com.tlf.edutech.msedutechb.api.cliente.rest.dto.ResponseCliente;

public interface ClienteUserCase {

    ResponseCliente cad(RequestCliente requestCliente);
}
