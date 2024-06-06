package br.com.tlf.edutech.msedutechb.api.billservice.rest;

import br.com.tlf.edutech.msedutechb.api.billservice.rest.dto.BillDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface BillServiceApi {

    @PostMapping("/file")
    public void file(@RequestBody BillDTO billDTO);
}
