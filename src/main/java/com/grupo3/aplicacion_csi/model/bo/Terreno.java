package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Terreno {

    private long idTerreno;

    private long idTipoSuelo;

    private long idFormaTerreno;

    private double areaTotal;

    private double areaUtil;

    private double frenteMetros;

    private double fondoMetros;

    private String zonificacion;

    private boolean serviciosBasicos;

    private String accesoVial;

    private String observaciones;

    private String coordenadas;

    private Date fechaAsignacion;

    public long getIdTerreno() {
        return idTerreno;
    }

    public void setIdTerreno(long idTerreno) {
        this.idTerreno = idTerreno;
    }

    public long getIdTipoSuelo() {
        return idTipoSuelo;
    }

    public void setIdTipoSuelo(long idTipoSuelo) {
        this.idTipoSuelo = idTipoSuelo;
    }

    public long getIdFormaTerreno() {
        return idFormaTerreno;
    }

    public void setIdFormaTerreno(long idFormaTerreno) {
        this.idFormaTerreno = idFormaTerreno;
    }

    public double getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(double areaUtil) {
        this.areaUtil = areaUtil;
    }

    public double getFondoMetros() {
        return fondoMetros;
    }

    public void setFondoMetros(double fondoMetros) {
        this.fondoMetros = fondoMetros;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getFrenteMetros() {
        return frenteMetros;
    }

    public void setFrenteMetros(double frenteMetros) {
        this.frenteMetros = frenteMetros;
    }

    public String getZonificacion() {
        return zonificacion;
    }

    public void setZonificacion(String zonificacion) {
        this.zonificacion = zonificacion;
    }

    public String getAccesoVial() {
        return accesoVial;
    }

    public void setAccesoVial(String accesoVial) {
        this.accesoVial = accesoVial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isServiciosBasicos() {
        return serviciosBasicos;
    }

    public void setServiciosBasicos(boolean serviciosBasicos) {
        this.serviciosBasicos = serviciosBasicos;
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
