package domain.empleado;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.empleado.valor.*;

import java.util.Set;


public class Empleado extends AggregateEvent<EmpleadoId> {

    protected Set<Compra> compras;
    protected Sucursal sucursal;
    protected Set<Meta> metas;

    protected Cargo cargo;
    protected Salario salario;
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;

    public Empleado(EmpleadoId entityId) {
        super(entityId);
    }

    /** Getters */
    public Set<Compra> compras() {
        return compras;
    }

    public Sucursal sucursal() {
        return sucursal;
    }

    public Set<Meta> metas() {
        return metas;
    }

    public Cargo cargo() {
        return cargo;
    }

    public Salario salario() {
        return salario;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Documento documento() {
        return documento;
    }

    public Direccion direccion() {
        return direccion;
    }
}
