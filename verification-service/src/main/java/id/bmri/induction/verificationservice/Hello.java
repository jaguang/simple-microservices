package id.bmri.induction.verificationservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hello/verification")
public class Hello {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping
    public String hello() {
        String url = "http://transfer-service/hello/world";
        return restTemplate.getForObject(url, String.class)+ " Mario Orlando";
    }
}
