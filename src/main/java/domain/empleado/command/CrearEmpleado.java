package domain.empleado.command;

import co.com.sofka.domain.generic.Command;
import domain.empleado.valor.*;

public class CrearEmpleado extends Command {

    private final EmpleadoId empleadoId;
    private final Cargo cargo;
    private final Salario salario;
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;

    public CrearEmpleado(EmpleadoId empleadoId, Cargo cargo, Salario salario, Nombre nombre, Documento documento, Direccion direccion) {
        this.empleadoId = empleadoId;
        this.cargo = cargo;
        this.salario = salario;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
    }

    public EmpleadoId getEmpleadoId() {
        return empleadoId;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Salario getSalario() {
        return salario;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

}
