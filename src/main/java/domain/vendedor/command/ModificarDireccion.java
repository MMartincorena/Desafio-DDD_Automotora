package domain.vendedor.command;

import co.com.sofka.domain.generic.Command;
import domain.vendedor.valor.Direccion;
import domain.vendedor.valor.VendedorId;

public class ModificarDireccion extends Command {

private final VendedorId vendedorId;
private final Direccion direccion;


    public ModificarDireccion(VendedorId vendedorId, Direccion direccion) {
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
