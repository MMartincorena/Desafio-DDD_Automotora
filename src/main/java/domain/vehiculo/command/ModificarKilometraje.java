package domain.vehiculo.command;

import co.com.sofka.domain.generic.Command;
import domain.vehiculo.valor.Kilometraje;
import domain.vehiculo.valor.VehiculoId;

public class ModificarKilometraje extends Command {

private final VehiculoId vehiculoId;
private final Kilometraje kilometraje;


    public ModificarKilometraje(VehiculoId vehiculoId, Kilometraje kilometraje) {
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
