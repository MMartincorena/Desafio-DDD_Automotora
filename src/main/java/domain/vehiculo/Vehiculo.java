package domain.vehiculo;

import co.com.sofka.domain.generic.AggregateEvent;

import domain.vehiculo.valor.*;

public class Vehiculo extends AggregateEvent<VehiculoId> {

    protected Marca marca;
    protected Caracteristicas caracteristicas;
    protected Valor_Mercado valor_mercado;
    protected Matricula matricula;
    protected Kilometraje kilometraje;
    protected Anio anio;
    protected Estado estado;
    protected Precio precio;


    public Vehiculo(VehiculoId entityId) {
        super(entityId);
    }

    /**
     * Getters
     */
    public Marca marca() {
        return marca;
    }

    public Caracteristicas caracteristicas() {
        return caracteristicas;
    }

    public Valor_Mercado valor_mercado() {
        return valor_mercado;
    }

    public Matricula matricula() {
        return matricula;
    }

    public Kilometraje kilometraje() {
        return kilometraje;
    }

    public Anio anio() {
        return anio;
    }

    public Estado estado() {
        return estado;
    }

    public Precio precio() {
        return precio;
    }
}
