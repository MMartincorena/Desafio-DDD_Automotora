package domain.vendedor.command;

import co.com.sofka.domain.generic.Command;
import domain.vendedor.valor.Nombre;
import domain.vendedor.valor.VendedorId;

public class ModificarNombre extends Command {

    private final VendedorId vendedorId;
    private final Nombre nombre;

    public ModificarNombre(VendedorId vendedorId, Nombre nombre) {
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
