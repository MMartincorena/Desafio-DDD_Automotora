package domain.empleado.command;

import co.com.sofka.domain.generic.Command;
import domain.empleado.valor.EmpleadoId;
import domain.empleado.valor.Nombre;

public class ModificarNombre extends Command {

    private final EmpleadoId empleadoId;
    private  final Nombre nombre;

    public ModificarNombre(EmpleadoId empleadoId, Nombre nombre) {
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
