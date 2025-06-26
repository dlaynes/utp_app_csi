package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;
import java.util.Date;

public class DetallePresupuestoMaterial {

    private long idDetallePresupuesto;

    private long idPresupuestoMaterial;

    private long idMaterial;

    private int stockUsado;

    private BigDecimal precioUnitario;

    private BigDecimal total;

    private Date fechaAsignacion;

    private boolean estado;

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

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockUsado() {
        return stockUsado;
    }

    public void setStockUsado(int stockUsado) {
        this.stockUsado = stockUsado;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
