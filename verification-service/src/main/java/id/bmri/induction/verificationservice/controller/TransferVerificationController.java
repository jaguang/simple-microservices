package id.bmri.induction.verificationservice.controller;

import id.bmri.induction.verificationservice.entity.TransferStage;
import id.bmri.induction.verificationservice.entity.TransferVerification;
import id.bmri.induction.verificationservice.request.TransferVerificationRequest;
import id.bmri.induction.verificationservice.response.TransferVerificationResponse;
import id.bmri.induction.verificationservice.service.TransferVerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/verification/v1/skn/provide")
public class TransferVerificationController {

    @Autowired
    TransferVerificationService transferVerificationService;

    @Autowired
    private RestTemplate restTemplate;


    @PostMapping
    public TransferVerificationResponse verifactionTransactionId(@RequestBody TransferVerificationRequest request) {

        TransferVerificationResponse transferVerificationResponse = new TransferVerificationResponse();
        TransferVerification transferVerification = new TransferVerification();
        String url = "http://transfer-service/transfer/preparation/all";
        ResponseEntity<List<TransferStage>> responseEntity = restTemplate.exchange(url, HttpMethod.GET,null, new ParameterizedTypeReference<List<TransferStage>>() {});
        List<TransferStage> lista = responseEntity.getBody();
        for (TransferStage transferStage : lista ) {
            if(request.getTransactionId().equals(transferStage.getTransactionId())) {
                transferVerification.setTransactionId(request.getTransactionId());
                transferVerification.setStatus("gg");
                transferVerificationService.save(transferVerification);
                transferVerificationResponse.setStatus("gg");
                return transferVerificationResponse;
            } else {
                transferVerificationResponse.setStatus("vailed");
            }
        }
        return transferVerificationResponse;
    }
}
