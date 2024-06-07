package br.com.tlf.edutech.msedutechb.core.application.service;

import br.com.tlf.edutech.msedutechb.api.billservice.rest.dto.BillDTO;
import br.com.tlf.edutech.msedutechb.api.exception.BillIdExistException;
import br.com.tlf.edutech.msedutechb.core.port.in.BillServiceUseCase;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BillServiceUseCaseImpl implements BillServiceUseCase {

    @Autowired
    private Set<String> billIdRepoCache;

    @Value("${wait}")
    private long wait;

    @SneakyThrows
    @Override
    public void processBill(BillDTO billDTO) {
        Thread.sleep(wait);
        if(!billIdRepoCache.add(billDTO.getId())){
            throw new BillIdExistException(String.format("Bill Id: %s exists", billDTO.getId()));
        }
    }

    @Override
    public void cleanIds() {

        billIdRepoCache.removeAll(billIdRepoCache);
    }
}
