package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.valor.Kilometraje;
import domain.vehiculo.valor.VehiculoId;

public class KilometradoModificado extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Kilometraje kilometraje;

    public KilometradoModificado(VehiculoId vehiculoId, Kilometraje kilometraje) {
        super("sofka.vehiculo.modificarkilometraje");
        this.vehiculoId = vehiculoId;
        this.kilometraje = kilometraje;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Kilometraje getKilometraje() {
        return kilometraje;
    }
}
