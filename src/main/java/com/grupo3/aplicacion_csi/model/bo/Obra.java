package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Obra {

    private long idObra;

    private long idFinanciamiento;

    private long idResponsable;

    private long idModeloObra;

    private long idTerreno;

    private long idTipoConstruccion;

    private Date fechaInicio;

    private Date fechaFinalizacion;

    private String nombre;

    private boolean activo;

    public long getIdObra() {
        return idObra;
    }

    public void setIdObra(long idObra) {
        this.idObra = idObra;
    }

    public long getIdFinanciamiento() {
        return idFinanciamiento;
    }

    public void setIdFinanciamiento(long idFinanciamiento) {
        this.idFinanciamiento = idFinanciamiento;
    }

    public long getIdResponsable() {
        return idResponsable;
    }

    public void setIdResponsable(long idResponsable) {
        this.idResponsable = idResponsable;
    }

    public long getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(long idTerreno) {
        this.idTerreno = idTerreno;
    }

    public long getIdTipoConstruccion() {
        return idTipoConstruccion;
    }

    public void setIdTipoConstruccion(long idTipoConstruccion) {
        this.idTipoConstruccion = idTipoConstruccion;
    }

    public long getIdModeloObra() {
        return idModeloObra;
    }

    public void setIdModeloObra(long idModeloObra) {
        this.idModeloObra = idModeloObra;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
