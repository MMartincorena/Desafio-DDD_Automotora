package domain.empleado.command;

import co.com.sofka.domain.generic.Command;
import domain.empleado.valor.Cargo;
import domain.empleado.valor.EmpleadoId;

public class ModificarCargo extends Command {

    private final EmpleadoId empleadoId;
    private final Cargo cargo;

    public ModificarCargo(EmpleadoId empleadoId, Cargo cargo) {
        this.empleadoId = empleadoId;
        this.cargo = cargo;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
