package id.bmri.induction.transferservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/world")

public class Hello {

    @GetMapping
    public String hello() {
        return "Hello World!";
    }
}
