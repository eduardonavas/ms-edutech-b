package br.com.tlf.edutech.msedutechb.core.application.service;

import br.com.tlf.edutech.msedutechb.api.billservice.rest.dto.BillDTO;
import br.com.tlf.edutech.msedutechb.api.exception.BillIdExistException;
import br.com.tlf.edutech.msedutechb.core.port.in.BillServiceUseCase;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class BillServiceUseCaseImpl implements BillServiceUseCase {

    private static Set<String> billIdRepoCache = new HashSet<>();

    @Value("${wait}")
    private long wait;

    @SneakyThrows
    @Override
    public synchronized void processBill(BillDTO billDTO) {
        Thread.sleep(wait);
        if(!billIdRepoCache.add(billDTO.getId())){
            throw new BillIdExistException(String.format("Bill Id: %s exists", billDTO.getId()));
        }
    }

    @Override
    public void cleanIds() {

        billIdRepoCache = new HashSet<>();
    }
}
