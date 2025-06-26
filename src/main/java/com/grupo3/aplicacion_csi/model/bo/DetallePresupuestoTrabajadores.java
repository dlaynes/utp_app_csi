package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;
import java.util.Date;

public class DetallePresupuestoTrabajadores {

    private long idDetallePresupuesto;

    private long idPresupuestoTrabajador;

    private long idEmpleado;

    private BigDecimal sueldo;

    private Date tiempoTotal;

    private boolean estado;

    public long getIdDetallePresupuesto() {
        return idDetallePresupuesto;
    }

    public void setIdDetallePresupuesto(long idDetallePresupuesto) {
        this.idDetallePresupuesto = idDetallePresupuesto;
    }

    public long getIdPresupuestoTrabajador() {
        return idPresupuestoTrabajador;
    }

    public void setIdPresupuestoTrabajador(long idPresupuestoTrabajador) {
        this.idPresupuestoTrabajador = idPresupuestoTrabajador;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Date getTiempoTotal() {
        return tiempoTotal;
    }

    public void setTiempoTotal(Date tiempoTotal) {
        this.tiempoTotal = tiempoTotal;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
