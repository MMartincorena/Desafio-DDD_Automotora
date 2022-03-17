package domain.empleado.command;

import co.com.sofka.domain.generic.Command;
import domain.empleado.valor.MetaId;
import domain.empleado.valor.Objetivo;
import domain.empleado.valor.RangoDinero;

public class AgregarMeta extends Command {

    private final MetaId metaId;
    private final RangoDinero rangoDinero;
    private final Objetivo objetivo;


    public AgregarMeta(MetaId metaId, RangoDinero rangoDinero, Objetivo objetivo) {
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
