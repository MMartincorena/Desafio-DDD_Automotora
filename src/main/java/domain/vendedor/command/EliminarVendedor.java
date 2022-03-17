package domain.vendedor.command;

import co.com.sofka.domain.generic.Command;
import domain.vendedor.valor.VendedorId;

public class EliminarVendedor extends Command {

    private final VendedorId vendedorId;

    public EliminarVendedor(VendedorId vendedorId) {
        this.vendedorId = vendedorId;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }
}

