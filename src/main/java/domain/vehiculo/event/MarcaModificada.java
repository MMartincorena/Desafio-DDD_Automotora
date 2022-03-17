package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.Marca;
import domain.vehiculo.valor.VehiculoId;

public class MarcaModificada extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Marca marca;

    public MarcaModificada(VehiculoId vehiculoId, Marca marca) {
        super("sofka.vehiculo.modificarmarca");
        this.vehiculoId = vehiculoId;
        this.marca = marca;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Marca getMarca() {
        return marca;
    }
}
