package domain.vehiculo.valor;

import co.com.sofka.domain.generic.Identity;
import domain.cliente.valor.Sucursal_VentasId;

public class CaracteristicasId extends Identity {

    public CaracteristicasId(){
    }

    private CaracteristicasId(String id) {
        super(id);
    }

    public static CaracteristicasId of(String id) {
        return new CaracteristicasId(id);
    }
}
