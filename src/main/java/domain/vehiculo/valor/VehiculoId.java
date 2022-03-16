package domain.vehiculo.valor;

import co.com.sofka.domain.generic.Identity;
import domain.cliente.valor.Sucursal_VentasId;

public class VehiculoId extends Identity {

    public VehiculoId(){
    }

    private VehiculoId(String id) {
        super(id);
    }

    public static VehiculoId of(String id) {
        return new VehiculoId(id);
    }

}
