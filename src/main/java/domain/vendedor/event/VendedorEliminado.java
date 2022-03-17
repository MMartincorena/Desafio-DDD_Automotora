package domain.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vendedor.valor.VendedorId;

public class VendedorEliminado extends DomainEvent {

    private final VendedorId vendedorId;

    public VendedorEliminado(VendedorId vendedorId) {
        super("sofka.vendedor.eliminarvendedor");
        this.vendedorId = vendedorId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}
