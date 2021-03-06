package domain.vendedor;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.vendedor.valor.*;

public class Vendedor extends AggregateEvent<VendedorId> {

    protected Sucursal_Ventas sucursal_ventas;
    protected Medio_Cobro medio_cobro;
    protected Historial historial;
    protected Nombre nombre;
    protected Documento documento;
    protected Direccion direccion;


    public Vendedor(VendedorId entityId) {
        super(entityId);
    }

    public Vendedor(VendedorId entityId, Sucursal_Ventas sucursal_ventas, Medio_Cobro medio_cobro, Historial historial, Nombre nombre, Documento documento, Direccion direccion) {
        super(entityId);
        this.sucursal_ventas = sucursal_ventas;
        this.medio_cobro = medio_cobro;
        this.historial = historial;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
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
