package diegobasili.u5_s3_l3.Composite;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;
@AllArgsConstructor
public class Libro{
    private double prezzo;
    private List<String> autori;
    private List<Elemento> elementi;

    public int getNumeroTotalePagine() {
        return elementi.stream().mapToInt(Elemento::getNumeroPagine).sum();
    }

    public int getNumeroPagine() {
        return elementi.stream().mapToInt(Elemento::getNumeroPagine).sum();
    }

    public void stampa() {
        System.out.println("stampa libro:");
        elementi.forEach(Elemento::stampa);
    }
}
