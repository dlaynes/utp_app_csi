package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;
import java.util.Date;

public class Terreno {

    private long idTerreno;

    private long idTipoSuelo;

    private long idFormaTerreno;

    private BigDecimal areaTotal;

    private BigDecimal areaUtil;

    private BigDecimal frenteMetros;

    private BigDecimal fondoMetros;

    private String zonificacion;

    private boolean serviciosBasicos;

    private String accesoVial;

    private String observaciones;

    private String coordenadas;

    private Date fechaAsignacion;

    private boolean estado;

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

    public BigDecimal getAreaUtil() {
        return areaUtil;
    }

    public void setAreaUtil(BigDecimal areaUtil) {
        this.areaUtil = areaUtil;
    }

    public BigDecimal getFondoMetros() {
        return fondoMetros;
    }

    public void setFondoMetros(BigDecimal fondoMetros) {
        this.fondoMetros = fondoMetros;
    }

    public BigDecimal getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(BigDecimal areaTotal) {
        this.areaTotal = areaTotal;
    }

    public BigDecimal getFrenteMetros() {
        return frenteMetros;
    }

    public void setFrenteMetros(BigDecimal frenteMetros) {
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
