package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;

public class FinanciamientoMaterial {

    private long idFinanciamientoMaterial;

    private int cantidad;

    private BigDecimal precioTotal;

    private long idFinanciamiento;

    private long idMaterial;

    public long getIdFinanciamientoMaterial() {
        return idFinanciamientoMaterial;
    }

    public void setIdFinanciamientoMaterial(long idFinanciamientoMaterial) {
        this.idFinanciamientoMaterial = idFinanciamientoMaterial;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(BigDecimal precioTotal) {
        this.precioTotal = precioTotal;
    }

    public long getIdFinanciamiento() {
        return idFinanciamiento;
    }

    public void setIdFinanciamiento(long idFinanciamiento) {
        this.idFinanciamiento = idFinanciamiento;
    }

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }
}
