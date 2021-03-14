package id.bmri.induction.transferservice.repository;

import id.bmri.induction.transferservice.entity.TransferTrx;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferTrxRepository extends JpaRepository<TransferTrx, String> {

//    <S extends TransferTrx> S save(S entity);

}
