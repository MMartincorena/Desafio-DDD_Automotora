package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.Caracteristicas;
import domain.vehiculo.Marca;
import domain.vehiculo.Valor_Mercado;
import domain.vehiculo.valor.*;

public class VehiculoEliminado extends DomainEvent {

    private final VehiculoId vehiculoId;


    public VehiculoEliminado(VehiculoId vehiculoId, Marca marca, Caracteristicas caracteristicas, Valor_Mercado valor_mercado, Matricula matricula, Kilometraje kilometraje, Anio anio, Estado estado, Precio precio) {
        super("sofka.vehiculo.eliminarvehiculo");
        this.vehiculoId = vehiculoId;
   }

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }


}
