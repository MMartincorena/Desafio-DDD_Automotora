package domain.empleado.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.empleado.valor.Cargo;
import domain.empleado.valor.EmpleadoId;

public class CargoModificado extends DomainEvent{

    private final EmpleadoId empleadoId;
    private final Cargo cargo;


    public CargoModificado(EmpleadoId empleadoId, Cargo cargo) {
        super("sofka.empleado.modificarcargo");
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
