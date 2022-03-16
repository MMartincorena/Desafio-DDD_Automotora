package domain.cliente;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.cliente.valor.*;

public class Cliente extends AggregateEvent<ClienteId> {

    protected Sucursal_Ventas sucursal_ventas;
    protected Medio_Cobro medio_cobro;
    protected Historial historial;
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;


    public Cliente(ClienteId entityId) {
        super(entityId);
    }

    /**
     * Getters
     */
    public Sucursal_Ventas sucursal_ventas() {
        return sucursal_ventas;
    }

    public Medio_Cobro medio_cobro() {
        return medio_cobro;
    }

    public Historial historial() {
        return historial;
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
