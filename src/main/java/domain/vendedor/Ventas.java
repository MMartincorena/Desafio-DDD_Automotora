package domain.vendedor;

import co.com.sofka.domain.generic.Entity;
import domain.vendedor.valor.Historial;
import domain.vendedor.valor.VentasId;


public class Ventas extends Entity<VentasId> {

    protected Historial historial;

    public Ventas(VentasId entityId) {
        super(entityId);
    }

    /** Getters */
    public Historial getHistorial() {
        return historial;
    }
}
