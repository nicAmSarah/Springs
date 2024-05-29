package br.com.suaempresa.sarahspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SarahspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SarahspringApplication.class, args);
	}
	@GetMapping("/hello")
    public String hello() {
 
		return "oie professor";
    }

}
