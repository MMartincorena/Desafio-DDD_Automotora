package domain.vehiculo.valor;

import co.com.sofka.domain.generic.Identity;
import domain.cliente.valor.Sucursal_VentasId;

public class MarcaId extends Identity {

    public MarcaId(){
    }

    private MarcaId(String id) {
        super(id);
    }

    public static MarcaId of(String id) {
        return new MarcaId(id);
    }

}
