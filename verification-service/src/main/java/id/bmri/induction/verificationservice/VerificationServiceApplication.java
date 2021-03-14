package id.bmri.induction.verificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VerificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VerificationServiceApplication.class, args);
	}

}
