package domain.vehiculo.command;

import co.com.sofka.domain.generic.Command;
import domain.vehiculo.Marca;

import domain.vehiculo.valor.VehiculoId;

public class ModificarMarca extends Command {

    private final VehiculoId vehiculoId;
    private final Marca marca;

    public ModificarMarca(VehiculoId vehiculoId, Marca marca) {
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

