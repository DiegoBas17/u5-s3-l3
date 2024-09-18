package diegobasili.u5_s3_l3.Composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pagina implements Elemento{
    private String testo;

    @Override
    public int getNumeroPagine() {
        return 1;
    }

    @Override
    public void stampa() {
        System.out.println("Pagina: " + testo);
    }
}
