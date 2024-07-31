package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(ScrenmatchApplication.class, args);
	}

	@Override
	public void run(String... arg) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
