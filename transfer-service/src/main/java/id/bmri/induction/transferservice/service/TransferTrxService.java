package id.bmri.induction.transferservice.service;

import id.bmri.induction.transferservice.entity.TransferTrx;
import id.bmri.induction.transferservice.repository.TransferTrxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferTrxService {

    @Autowired
    TransferTrxRepository transferTrxRepository;

    public TransferTrx save(TransferTrx transferTrx) {
        return transferTrxRepository.save(transferTrx);
    }
}
