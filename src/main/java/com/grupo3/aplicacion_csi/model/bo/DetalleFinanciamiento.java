package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;
import java.util.Date;

public class DetalleFinanciamiento {

    private long idDetalleFinanciamiento;

    private long idFinanciamiento;

    private long idPresupuestoMaterial;

    private long idPresupuestoTrabajador;

    private BigDecimal monto;

    private Date fechaPago;

    private boolean estado;

    public long getIdDetalleFinanciamiento() {
        return idDetalleFinanciamiento;
    }

    public void setIdDetalleFinanciamiento(long idDetalleFinanciamiento) {
        this.idDetalleFinanciamiento = idDetalleFinanciamiento;
    }

    public long getIdFinanciamiento() {
        return idFinanciamiento;
    }

    public void setIdFinanciamiento(long idFinanciamiento) {
        this.idFinanciamiento = idFinanciamiento;
    }

    public long getIdPresupuestoMaterial() {
        return idPresupuestoMaterial;
    }

    public void setIdPresupuestoMaterial(long idPresupuestoMaterial) {
        this.idPresupuestoMaterial = idPresupuestoMaterial;
    }

    public long getIdPresupuestoTrabajador() {
        return idPresupuestoTrabajador;
    }

    public void setIdPresupuestoTrabajador(long idPresupuestoTrabajador) {
        this.idPresupuestoTrabajador = idPresupuestoTrabajador;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
