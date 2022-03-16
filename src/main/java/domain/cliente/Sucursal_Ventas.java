package domain.cliente;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.valor.Localizacion;
import domain.cliente.valor.Nombre;
import domain.cliente.valor.Sucursal_VentasId;

public class Sucursal_Ventas extends Entity<Sucursal_VentasId> {

    protected Nombre nombre;
    protected Localizacion localizacion;

    public Sucursal_Ventas(Sucursal_VentasId entityId) {
        super(entityId);
    }


    /** Getters */
    public Nombre nombre() {
        return nombre;
    }

    public Localizacion localizacion() {
        return localizacion;
    }
}
