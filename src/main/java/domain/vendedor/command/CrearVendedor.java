package domain.vendedor.command;

import co.com.sofka.domain.generic.Command;
import domain.vendedor.Medio_Cobro;
import domain.vendedor.Sucursal_Ventas;
import domain.vendedor.valor.*;

public class CrearVendedor extends Command {

    private final VendedorId vendedorId;
    private final Sucursal_Ventas sucursal_ventas;
    private final Medio_Cobro medio_cobro;
    private final Historial historial;
    private final Nombre nombre;
    private final Documento documento;
    private final Direccion direccion;

    public CrearVendedor(VendedorId vendedorId, Sucursal_Ventas sucursal_ventas, Medio_Cobro medio_cobro, Historial historial, Nombre nombre, Documento documento, Direccion direccion) {
        this.vendedorId = vendedorId;
        this.sucursal_ventas = sucursal_ventas;
        this.medio_cobro = medio_cobro;
        this.historial = historial;
        this.nombre = nombre;
        this.documento = documento;
        this.direccion = direccion;
    }

    public VendedorId getVendedorId() {
        return vendedorId;
    }

    public Sucursal_Ventas getSucursal_ventas() {
        return sucursal_ventas;
    }

    public Medio_Cobro getMedio_cobro() {
        return medio_cobro;
    }

    public Historial getHistorial() {
        return historial;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
