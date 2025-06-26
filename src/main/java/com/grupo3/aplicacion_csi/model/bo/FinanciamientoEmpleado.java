package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;

public class FinanciamientoEmpleado {

    private long idFinanciamientoEmpleado;

    private long idEmpleado;

    private long idFinanciamiento;

    private BigDecimal costoTotal;

    private int diasParticipacion;

    public long getIdFinanciamientoEmpleado() {
        return idFinanciamientoEmpleado;
    }

    public void setIdFinanciamientoEmpleado(long idFinanciamientoEmpleado) {
        this.idFinanciamientoEmpleado = idFinanciamientoEmpleado;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public long getIdFinanciamiento() {
        return idFinanciamiento;
    }

    public void setIdFinanciamiento(long idFinanciamiento) {
        this.idFinanciamiento = idFinanciamiento;
    }

    public BigDecimal getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(BigDecimal costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getDiasParticipacion() {
        return diasParticipacion;
    }

    public void setDiasParticipacion(int diasParticipacion) {
        this.diasParticipacion = diasParticipacion;
    }
}
