package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.valor.Precio;
import domain.vehiculo.valor.VehiculoId;

public class PrecioAgregado extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Precio precio;

    public PrecioAgregado(VehiculoId vehiculoId, Precio precio) {
        super("sofka.vehiculo.agregarprecio");
        this.vehiculoId = vehiculoId;
        this.precio = precio;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Precio getPrecio() {
        return precio;
    }
}
