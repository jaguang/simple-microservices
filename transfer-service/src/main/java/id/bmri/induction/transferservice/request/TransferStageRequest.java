package id.bmri.induction.transferservice.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransferStageRequest {

    private String fromAccountNumber;

    private String toAccountNumber;

    private Integer amount;
}
