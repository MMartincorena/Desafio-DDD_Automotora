package domain.empleado;

import co.com.sofka.domain.generic.Entity;

import domain.empleado.valor.CompraId;
import domain.empleado.valor.ValorFinal;

public class Compra extends Entity<CompraId> {

    protected ValorFinal valorFinal;


    public Compra(CompraId entityId) {
        super(entityId);
    }


}
