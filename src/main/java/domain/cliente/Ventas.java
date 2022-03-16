package domain.cliente;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.valor.Historial;
import domain.cliente.valor.VentasId;


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
