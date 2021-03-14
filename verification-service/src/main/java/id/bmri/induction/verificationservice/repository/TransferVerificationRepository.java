package id.bmri.induction.verificationservice.repository;

import id.bmri.induction.verificationservice.entity.TransferVerification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferVerificationRepository extends JpaRepository<TransferVerification, String> {
    TransferVerification findByTransactionId(String Id);

//    <S extends TransferVerification> S save(S entity);
}
