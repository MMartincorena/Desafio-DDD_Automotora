package domain.empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.valor.*;

public class EmpleadoEliminado extends DomainEvent {

    private final EmpleadoId empleadoId;


    public EmpleadoEliminado(EmpleadoId empleadoId, Cargo cargo, Salario salario, Nombre nombre, Documento documento, Direccion direccion) {
        super("sofka.empleado.eliminarempleado");
        this.empleadoId = empleadoId;

    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

}
