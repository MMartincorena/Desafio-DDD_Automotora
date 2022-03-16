package domain.vendedor;

import co.com.sofka.domain.generic.Entity;
import domain.vendedor.valor.Localizacion;
import domain.vendedor.valor.Nombre;
import domain.vendedor.valor.Sucursal_VentasId;

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
