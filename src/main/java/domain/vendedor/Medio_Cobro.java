package domain.vendedor;

import co.com.sofka.domain.generic.Entity;
import domain.vendedor.valor.Medio_CobroId;
import domain.vendedor.valor.TipoMedio;

public class Medio_Cobro extends Entity<Medio_CobroId> {

    protected TipoMedio tipoMedio;


    public Medio_Cobro(Medio_CobroId entityId) {
        super(entityId);
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }
}
