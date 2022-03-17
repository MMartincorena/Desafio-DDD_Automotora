package domain.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vendedor.valor.Direccion;
import domain.vendedor.valor.VendedorId;

public class DireccionModificada extends DomainEvent {

    private final VendedorId vendedorId;
    private final Direccion direccion;

    public DireccionModificada(VendedorId vendedorId, Direccion direccion) {
        super("sofka.vendedor.modificarvendedor");
        this.vendedorId = vendedorId;
        this.direccion = direccion;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
