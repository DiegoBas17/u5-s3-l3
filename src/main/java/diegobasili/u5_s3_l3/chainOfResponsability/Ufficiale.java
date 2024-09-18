package diegobasili.u5_s3_l3.chainOfResponsability;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Ufficiale {
    protected String grado;
    protected int stipendio;
    protected Ufficiale superiore;

    public Ufficiale(String grado, int stipendio) {
        this.grado = grado;
        this.stipendio = stipendio;
    }

    public void stipendoMinimo (int importo) {
        if (importo <= stipendio && superiore != null) {
            System.out.println("il " + grado + " percepisce lo stipendio di: " + importo);
            superiore.stipendoMinimo(importo);
        } else {
            System.out.println("Nessuno prende questi stipendio: " + importo);
        }
    }
}
