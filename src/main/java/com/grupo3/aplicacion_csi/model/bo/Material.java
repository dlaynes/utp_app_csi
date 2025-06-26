package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;

public class Material {

    private long idMaterial;

    private long idTipoMaterial;

    private String nombre;

    private BigDecimal precioUnitario;

    private int stockActual;

    private BigDecimal masaEspecifica;

    private BigDecimal longitud;

    private BigDecimal temperaturaTermodinamica;

    private String descripcion;

    private boolean estado;

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public long getIdTipoMaterial() {
        return idTipoMaterial;
    }

    public void setIdTipoMaterial(long idTipoMaterial) {
        this.idTipoMaterial = idTipoMaterial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public BigDecimal getMasaEspecifica() {
        return masaEspecifica;
    }

    public void setMasaEspecifica(BigDecimal masaEspecifica) {
        this.masaEspecifica = masaEspecifica;
    }

    public BigDecimal getLongitud() {
        return longitud;
    }

    public void setLongitud(BigDecimal longitud) {
        this.longitud = longitud;
    }

    public BigDecimal getTemperaturaTermodinamica() {
        return temperaturaTermodinamica;
    }

    public void setTemperaturaTermodinamica(BigDecimal temperaturaTermodinamica) {
        this.temperaturaTermodinamica = temperaturaTermodinamica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
