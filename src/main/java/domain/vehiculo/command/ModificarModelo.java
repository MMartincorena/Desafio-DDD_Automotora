package domain.vehiculo.command;

import co.com.sofka.domain.generic.Command;
import domain.vehiculo.valor.Modelo;
import domain.vehiculo.valor.VehiculoId;

public class ModificarModelo extends Command {


    private final VehiculoId vehiculoId;
    private final Modelo modelo;

    public ModificarModelo(VehiculoId vehiculoId, Modelo modelo) {
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
