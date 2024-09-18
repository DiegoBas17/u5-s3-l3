package diegobasili.u5_s3_l3.Composite;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Pagina pagina = new Pagina("Contenuto della pagina ");
        Sezione sezione = new Sezione(List.of(pagina, pagina, pagina, pagina, pagina));
        Libro libro = new Libro(22.5, List.of("autore", "autore1"), List.of(sezione, sezione, sezione, sezione));
        System.out.println("numero pagine totali del libro: " + libro.getNumeroPagine());
    }
}
