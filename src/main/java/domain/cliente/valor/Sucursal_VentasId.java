package domain.cliente.valor;

import co.com.sofka.domain.generic.Identity;
import domain.empleado.valor.EmpleadoId;

public class Sucursal_VentasId extends Identity {

    public Sucursal_VentasId(){
    }

    private Sucursal_VentasId(String id) {
        super(id);
    }

    public static Sucursal_VentasId of(String id) {
        return new Sucursal_VentasId(id);
    }

}
