package id.bmri.induction.transferservice.repository;

import id.bmri.induction.transferservice.entity.TransferStage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferStageRepository extends JpaRepository<TransferStage, String> {

    TransferStage findByTransactionId(String id);

    <S extends TransferStage> S save(S entity);

}
