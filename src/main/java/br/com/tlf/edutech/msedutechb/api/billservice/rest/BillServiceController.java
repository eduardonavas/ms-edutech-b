package br.com.tlf.edutech.msedutechb.api.billservice.rest;

import br.com.tlf.edutech.msedutechb.api.billservice.rest.dto.BillDTO;
import br.com.tlf.edutech.msedutechb.core.port.in.BillServiceUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillServiceController implements BillServiceApi{

    @Autowired
    private BillServiceUseCase billServiceUseCase;

    @Override
    public void file(BillDTO billDTO) {
        billServiceUseCase.processBill(billDTO);
    }

    @Override
    public void deleteIds() {

    }
}
