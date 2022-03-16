package domain.empleado;

import co.com.sofka.domain.generic.Entity;
import domain.empleado.valor.MetaId;
import domain.empleado.valor.Objetivo;
import domain.empleado.valor.RangoDinero;

public class Meta extends Entity<MetaId> {

    protected RangoDinero rangoDinero;
    protected Objetivo objetivo;

    public Meta(MetaId entityId) {
        super(entityId);
    }
}
