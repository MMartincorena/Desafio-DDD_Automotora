package domain.vehiculo;

import co.com.sofka.domain.generic.Entity;
import domain.vehiculo.valor.MarcaId;
import domain.vehiculo.valor.Modelo;
import domain.vehiculo.valor.Nombre_Marca;
import domain.vehiculo.valor.Version;

public class Marca extends Entity<MarcaId> {

    protected Nombre_Marca nombre_marca;
    protected Modelo modelo;
    protected Version version;

    /** Getters */
    public Marca(MarcaId entityId) {
        super(entityId);
    }

    public Nombre_Marca nombre_marca() {
        return nombre_marca;
    }

    public Modelo modelo() {
        return modelo;
    }

    public Version version() {
        return version;
    }
}
