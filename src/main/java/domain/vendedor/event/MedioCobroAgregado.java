package domain.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vendedor.valor.Medio_CobroId;
import domain.vendedor.valor.TipoMedio;
import domain.vendedor.valor.VendedorId;

public class MedioCobroAgregado extends DomainEvent {

    private final VendedorId vendedorId;
    private final Medio_CobroId medio_cobroId;
    private final TipoMedio tipoMedio;


    public MedioCobroAgregado(VendedorId vendedorId, Medio_CobroId medio_cobroId, TipoMedio tipoMedio) {
        super("sofka.vendedor.agregarmediocobro");
        this.vendedorId = vendedorId;
        this.medio_cobroId = medio_cobroId;
        this.tipoMedio = tipoMedio;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Medio_CobroId getMedio_cobroId() {
        return medio_cobroId;
    }

    public TipoMedio getTipoMedio() {
        return tipoMedio;
    }
}
