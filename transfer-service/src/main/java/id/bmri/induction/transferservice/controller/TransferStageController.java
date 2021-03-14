package id.bmri.induction.transferservice.controller;

import id.bmri.induction.transferservice.entity.TransferStage;
import id.bmri.induction.transferservice.request.TransferStageRequest;
import id.bmri.induction.transferservice.response.TransferStageResponse;
import id.bmri.induction.transferservice.service.TransferStageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/transfer/preparation")
public class TransferStageController {

    @Autowired
    TransferStageService transferStageService;



    @PostMapping
    public TransferStageResponse addPreparation(@RequestBody TransferStageRequest request) {
        TransferStage transferStage = new TransferStage();
        UUID uuid = UUID.randomUUID();
        String uuidAsString = uuid.toString();
        transferStage.setFromAccountNumber(request.getFromAccountNumber());
        transferStage.setToAccountNumber(request.getToAccountNumber());
        transferStage.setAmount(request.getAmount());
        transferStage.setTransactionId(uuidAsString);
        transferStageService.addTransaction(transferStage);

        TransferStageResponse preparationRequest = new TransferStageResponse();
        preparationRequest.setTransactionId(transferStage.getTransactionId());

        return preparationRequest;
    }

    @GetMapping("/all")
    public List<TransferStage> findAllTransferStage() {
        return transferStageService.findAll();
    }
}
