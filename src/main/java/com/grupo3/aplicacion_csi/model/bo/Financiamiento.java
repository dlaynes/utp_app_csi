package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Financiamiento {

    private long idFinanciamiento;

    private long idTipoFinanciamiento;

    private long idCliente;

    private String codigoFinanciamiento;

    private double subTotal;

    private double igv;

    private double total;

    private Date fechaFinanciamiento;

    private String formaPago;

    private boolean activo;

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

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
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

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
