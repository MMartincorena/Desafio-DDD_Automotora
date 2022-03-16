package domain.vehiculo;

import co.com.sofka.domain.generic.Entity;
import domain.cliente.valor.Sucursal_VentasId;
import domain.vehiculo.valor.RangoValorUsado;
import domain.vehiculo.valor.ValorNuevo;
import domain.vehiculo.valor.Valor_MercadoId;

public class Valor_Mercado extends Entity<Valor_MercadoId> {

    protected ValorNuevo valorNuevo;
    protected RangoValorUsado rangoValorUsado;

    public Valor_Mercado(Valor_MercadoId entityId) {
        super(entityId);
    }
}
