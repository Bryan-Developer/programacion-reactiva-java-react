package bryan.developer.curso.programacion.reactiva.springbootreactivo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Flux<String> nombres = Flux.just("Andres", "Bryan", "Marco", "Mercedes", "Romina", "Pedro", "Fiorella", "Anita")
				.doOnNext(System.out::println);
		nombres.subscribe();
	}
}
