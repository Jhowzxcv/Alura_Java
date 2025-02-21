package br.com.alura.ScreenMatch;

import br.com.alura.ScreenMatch.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
		//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
	}
}