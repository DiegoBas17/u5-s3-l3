package diegobasili.u5_s3_l3.adapter;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

@AllArgsConstructor
public class Adapter implements DataSource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        return calcolaEta(info.getDataDiNascita());
    }

    public int calcolaEta(Date dataDiNascita) {
        LocalDate dataNascitaLocale = dataDiNascita.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return Period.between(dataNascitaLocale, LocalDate.now()).getYears();
    }
}
