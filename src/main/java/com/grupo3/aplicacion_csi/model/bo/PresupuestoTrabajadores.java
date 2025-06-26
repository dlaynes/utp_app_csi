package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class PresupuestoTrabajadores {

    private long idPresupuestoTrabajadores;

    private Date fechaPresupuesto;

    private String descripcion;

    private String observaciones;

    private boolean estado;

    public long getIdPresupuestoTrabajadores() {
        return idPresupuestoTrabajadores;
    }

    public void setIdPresupuestoTrabajadores(long idPresupuestoTrabajadores) {
        this.idPresupuestoTrabajadores = idPresupuestoTrabajadores;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getFechaPresupuesto() {
        return fechaPresupuesto;
    }

    public void setFechaPresupuesto(Date fechaPresupuesto) {
        this.fechaPresupuesto = fechaPresupuesto;
    }
}
