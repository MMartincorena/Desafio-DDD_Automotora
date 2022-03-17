package domain.empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.Meta;
import domain.empleado.valor.EmpleadoId;
import domain.empleado.valor.MetaId;

public class MetaModificada extends DomainEvent {

    private final MetaId metaId;
    private final EmpleadoId empleadoId;
    private final Meta meta;


    public MetaModificada(MetaId metaId, EmpleadoId empleadoId, Meta meta) {
        super("sofka.empleado.modificarmeta");
        this.metaId = metaId;
        this.empleadoId = empleadoId;
        this.meta = meta;
    }

    public MetaId getMetaId() {
        return metaId;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Meta getMeta() {
        return meta;
    }
}
