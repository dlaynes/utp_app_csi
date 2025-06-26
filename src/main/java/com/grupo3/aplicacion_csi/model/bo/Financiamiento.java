package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;
import java.util.Date;

public class Financiamiento {

    private long idFinanciamiento;

    private long idTipoFinanciamiento;

    private long idCliente;

    private String codigoFinanciamiento;

    private BigDecimal subTotal;

    private BigDecimal igv;

    private BigDecimal total;

    private Date fechaFinanciamiento;

    private String formaPago;

    private boolean estado;

    public long getIdFinanciamiento() {
        return idFinanciamiento;
    }

    public void setIdFinanciamiento(long idFinanciamiento) {
        this.idFinanciamiento = idFinanciamiento;
    }

    public long getIdTipoFinanciamiento() {
        return idTipoFinanciamiento;
    }

    public void setIdTipoFinanciamiento(long idTipoFinanciamiento) {
        this.idTipoFinanciamiento = idTipoFinanciamiento;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCodigoFinanciamiento() {
        return codigoFinanciamiento;
    }

    public void setCodigoFinanciamiento(String codigoFinanciamiento) {
        this.codigoFinanciamiento = codigoFinanciamiento;
    }

    public BigDecimal getIgv() {
        return igv;
    }

    public void setIgv(BigDecimal igv) {
        this.igv = igv;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Date getFechaFinanciamiento() {
        return fechaFinanciamiento;
    }

    public void setFechaFinanciamiento(Date fechaFinanciamiento) {
        this.fechaFinanciamiento = fechaFinanciamiento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
