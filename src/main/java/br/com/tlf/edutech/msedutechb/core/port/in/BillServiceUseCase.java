package br.com.tlf.edutech.msedutechb.core.port.in;

import br.com.tlf.edutech.msedutechb.api.billservice.rest.dto.BillDTO;

public interface BillServiceUseCase {

    void processBill(BillDTO billDTO);
}
