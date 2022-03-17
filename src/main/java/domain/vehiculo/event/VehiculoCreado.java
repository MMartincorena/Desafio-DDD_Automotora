package domain.vehiculo.event;

import co.com.sofka.domain.generic.DomainEvent;
import domain.vehiculo.Caracteristicas;
import domain.vehiculo.Marca;
import domain.vehiculo.Valor_Mercado;
import domain.vehiculo.valor.*;

public class VehiculoCreado extends DomainEvent {

    private final VehiculoId vehiculoId;
    private final Marca marca;
    private final Caracteristicas caracteristicas;
    private final Valor_Mercado valor_mercado;
    private final Matricula matricula;
    private final Kilometraje kilometraje;
    private final Anio anio;
    private final Estado estado;
    private final Precio precio;

    public VehiculoCreado(VehiculoId vehiculoId, Marca marca, Caracteristicas caracteristicas, Valor_Mercado valor_mercado, Matricula matricula, Kilometraje kilometraje, Anio anio, Estado estado, Precio precio) {
        super("sofka.vehiculo.crearvehiculo");
        this.vehiculoId = vehiculoId;
        this.marca = marca;
        this.caracteristicas = caracteristicas;
        this.valor_mercado = valor_mercado;
        this.matricula = matricula;
        this.kilometraje = kilometraje;
        this.anio = anio;
        this.estado = estado;
        this.precio = precio;
    }
}
