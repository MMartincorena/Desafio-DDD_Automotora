package domain.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vendedor.valor.Nombre;
import domain.vendedor.valor.VendedorId;

public class NombreModificado extends DomainEvent {

    private final VendedorId vendedorId;
    private final Nombre nombre;


    public NombreModificado(VendedorId vendedorId, Nombre nombre) {
        super("modificarnombre");
        this.vendedorId = vendedorId;
        this.nombre = nombre;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
