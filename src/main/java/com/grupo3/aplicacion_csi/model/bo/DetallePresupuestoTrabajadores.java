package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class DetallePresupuestoTrabajadores {

    private long idDetallePresupuesto;

    private long idPresupuestoTrabajador;

    private long idEmpleado;

    private double sueldo;

    private Date tiempoTotal;

    private boolean activo;

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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
