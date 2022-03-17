package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.valor.Modelo;
import domain.vehiculo.valor.VehiculoId;

public class ModeloModificado extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Modelo modelo;

    public ModeloModificado(VehiculoId vehiculoId, Modelo modelo) {
        super("sofka.vehiculo.modificarmodelo");
        this.vehiculoId = vehiculoId;
        this.modelo = modelo;
    }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Modelo getModelo() {
        return modelo;
    }
}
