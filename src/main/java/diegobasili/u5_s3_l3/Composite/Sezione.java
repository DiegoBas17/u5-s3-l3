package diegobasili.u5_s3_l3.Composite;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Sezione implements Elemento{
    private List<Elemento> pagine = new ArrayList<>();
    @Override
    public int getNumeroPagine() {
        return pagine.size();
    }

    @Override
    public void stampa() {
        pagine.forEach(Elemento::stampa);
    }
}
