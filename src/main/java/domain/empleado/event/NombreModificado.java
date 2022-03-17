package domain.empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.valor.EmpleadoId;
import domain.empleado.valor.Nombre;

public class NombreModificado extends DomainEvent {

    private final EmpleadoId empleadoId;
    private  final Nombre nombre;

    public NombreModificado(EmpleadoId empleadoId, Nombre nombre) {
        super("sofka.empleado.modificarnombre");
        this.empleadoId = empleadoId;
        this.nombre = nombre;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
