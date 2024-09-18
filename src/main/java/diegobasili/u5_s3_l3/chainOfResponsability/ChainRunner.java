package diegobasili.u5_s3_l3.chainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Generale generale = new Generale("Generale", 5000);
        Colonnello colonnello = new Colonnello("Colonnello", 4000, generale);
        Maggiore maggiore = new Maggiore("Maggiore", 3000, colonnello);
        Capitano capitano = new Capitano("Capitano", 2000, maggiore);
        Tenente tenente = new Tenente("Tenente", 1000, capitano);

        tenente.stipendoMinimo(2000);
    }
}
