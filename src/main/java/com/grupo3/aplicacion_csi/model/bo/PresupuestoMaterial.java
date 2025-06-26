package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class PresupuestoMaterial {

    private long idPresupuestoMaterial;

    private Date fechaPresupuesto;

    private String descripcion;

    private String observaciones;

    private boolean estado;

    public long getIdPresupuestoMaterial() {
        return idPresupuestoMaterial;
    }

    public void setIdPresupuestoMaterial(long idPresupuestoMaterial) {
        this.idPresupuestoMaterial = idPresupuestoMaterial;
    }

    public Date getFechaPresupuesto() {
        return fechaPresupuesto;
    }

    public void setFechaPresupuesto(Date fechaPresupuesto) {
        this.fechaPresupuesto = fechaPresupuesto;
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
}
