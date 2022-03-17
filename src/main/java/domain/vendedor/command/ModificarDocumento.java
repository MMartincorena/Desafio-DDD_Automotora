package domain.vendedor.command;

import co.com.sofka.domain.generic.Command;
import domain.vendedor.valor.Documento;
import domain.vendedor.valor.VendedorId;

public class ModificarDocumento extends Command {

    private final VendedorId vendedorId;
    private final Documento documento;

    public ModificarDocumento(VendedorId vendedorId, Documento documento) {
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
