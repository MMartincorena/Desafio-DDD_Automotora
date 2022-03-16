package domain.cliente;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.valor.Medio_CobroId;
import domain.cliente.valor.TipoMedio;

public class Medio_Cobro extends Entity<Medio_CobroId> {

    protected TipoMedio tipoMedio;


    public Medio_Cobro(Medio_CobroId entityId) {
        super(entityId);
    }


}
