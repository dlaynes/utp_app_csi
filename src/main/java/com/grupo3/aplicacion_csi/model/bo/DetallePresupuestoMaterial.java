package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class DetallePresupuestoMaterial {

    private long idDetallePresupuesto;

    private long idPresupuestoMaterial;

    private long idMaterial;

    private int stockUsado;

    private double precioUnitario;

    private double total;

    private Date fechaAsignacion;

    private boolean activo;

    public long getIdDetallePresupuesto() {
        return idDetallePresupuesto;
    }

    public void setIdDetallePresupuesto(long idDetallePresupuesto) {
        this.idDetallePresupuesto = idDetallePresupuesto;
    }

    public long getIdPresupuestoMaterial() {
        return idPresupuestoMaterial;
    }

    public void setIdPresupuestoMaterial(long idPresupuestoMaterial) {
        this.idPresupuestoMaterial = idPresupuestoMaterial;
    }

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockUsado() {
        return stockUsado;
    }

    public void setStockUsado(int stockUsado) {
        this.stockUsado = stockUsado;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
