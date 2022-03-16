package domain.vendedor.valor;

import co.com.sofka.domain.generic.Identity;


public class VentasId extends Identity {

    public VentasId(){
    }

    private VentasId(String id) {
        super(id);
    }

    public static VentasId of(String id) {
        return new VentasId(id);
    }

}
