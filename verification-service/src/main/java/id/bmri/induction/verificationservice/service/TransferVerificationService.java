package id.bmri.induction.verificationservice.service;

import id.bmri.induction.verificationservice.entity.TransferVerification;
import id.bmri.induction.verificationservice.repository.TransferVerificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferVerificationService {

    @Autowired
    TransferVerificationRepository transferVerificationRepository;

    public TransferVerification findByTransactionId(String Id) {
        return transferVerificationRepository.findByTransactionId(Id);
    }

    public TransferVerification save(TransferVerification transferVerification) {
        return transferVerificationRepository.save(transferVerification);
    }
}
