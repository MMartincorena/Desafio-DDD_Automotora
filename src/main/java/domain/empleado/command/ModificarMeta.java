package domain.empleado.command;

import co.com.sofka.domain.generic.Command;
import domain.empleado.Meta;
import domain.empleado.valor.EmpleadoId;
import domain.empleado.valor.MetaId;

public class ModificarMeta extends Command {

    private final MetaId metaId;
    private final EmpleadoId empleadoId;
    private final Meta meta;

    public ModificarMeta(MetaId metaId, EmpleadoId empleadoId, Meta meta) {
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
