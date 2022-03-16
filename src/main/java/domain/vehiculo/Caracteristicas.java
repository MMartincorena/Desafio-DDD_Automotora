package domain.vehiculo;

import co.com.sofka.domain.generic.Entity;
import domain.vehiculo.valor.CaracteristicasId;
import domain.vehiculo.valor.ComponentesExtras;

public class Caracteristicas extends Entity<CaracteristicasId> {

    protected ComponentesExtras componentesExtras;

    public Caracteristicas(CaracteristicasId entityId) {
        super(entityId);
    }

    /** Getters */
    public ComponentesExtras getComponentesExtras() {
        return componentesExtras;
    }
}
