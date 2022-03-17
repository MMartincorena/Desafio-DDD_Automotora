package domain.vehiculo.command;

import co.com.sofka.domain.generic.Command;
import domain.vehiculo.Caracteristicas;
import domain.vehiculo.Marca;
import domain.vehiculo.Valor_Mercado;
import domain.vehiculo.valor.*;

public class CrearVehiculo extends Command {

    private final VehiculoId vehiculoId;
    private final Marca marca;
    private final Caracteristicas caracteristicas;
    private final Valor_Mercado valor_mercado;
    private final Matricula matricula;
    private final Kilometraje kilometraje;
    private final Anio anio;
    private final Estado estado;
    private final Precio precio;

    public CrearVehiculo(VehiculoId vehiculoId, Marca marca, Caracteristicas caracteristicas, Valor_Mercado valor_mercado, Matricula matricula, Kilometraje kilometraje, Anio anio, Estado estado, Precio precio) {
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

    public VehiculoId getVehiculoId() {
        return vehiculoId;
    }

    public Marca getMarca() {
        return marca;
    }

    public Caracteristicas getCaracteristicas() {
        return caracteristicas;
    }

    public Valor_Mercado getValor_mercado() {
        return valor_mercado;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public Kilometraje getKilometraje() {
        return kilometraje;
    }

    public Anio getAnio() {
        return anio;
    }

    public Estado getEstado() {
        return estado;
    }

    public Precio getPrecio() {
        return precio;
    }
}



