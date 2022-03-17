package domain.vendedor.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vendedor.valor.Documento;
import domain.vendedor.valor.VendedorId;

public class DocumentoModificado extends DomainEvent {

    private final VendedorId vendedorId;
    private final Documento documento;

    public DocumentoModificado(VendedorId vendedorId, Documento documento) {
        super("sofka.vendedor.modificardocumento");
        this.vendedorId = vendedorId;
        this.documento = documento;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Documento getDocumento() {
        return documento;
    }
}
