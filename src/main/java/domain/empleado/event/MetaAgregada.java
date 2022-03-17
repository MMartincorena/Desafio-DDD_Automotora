package domain.empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.valor.MetaId;
import domain.empleado.valor.Objetivo;
import domain.empleado.valor.RangoDinero;

public class MetaAgregada extends DomainEvent {

    private final MetaId metaId;
    private final RangoDinero rangoDinero;
    private final Objetivo objetivo;

    public MetaAgregada(MetaId metaId, RangoDinero rangoDinero, Objetivo objetivo) {
        super("sofka.empleado.agregarmeta");
        this.metaId = metaId;
        this.rangoDinero = rangoDinero;
        this.objetivo = objetivo;
    }

    public MetaId getMetaId() {
        return metaId;
    }

    public RangoDinero getRangoDinero() {
        return rangoDinero;
    }

    public Objetivo getObjetivo() {
        return objetivo;
    }
}
