package com.grupo3.aplicacion_csi.model.bo;

import java.math.BigDecimal;

public class ModeloObra {

    private long idModeloObra;

    private long idTipoObra;

    private String urModelo3d;

    private String nombre;

    private String descripcion;

    private String usoDestinado;

    private int pisos;

    private int ambientes;

    private BigDecimal areaTotal;

    private int capacidadPersonas;

    private BigDecimal precioPreferencial;

    private boolean estado;

    public long getIdModeloObra() {
        return idModeloObra;
    }

    public void setIdModeloObra(long idModeloObra) {
        this.idModeloObra = idModeloObra;
    }

    public long getIdTipoObra() {
        return idTipoObra;
    }

    public void setIdTipoObra(long idTipoObra) {
        this.idTipoObra = idTipoObra;
    }

    public String getUrModelo3d() {
        return urModelo3d;
    }

    public void setUrModelo3d(String urModelo3d) {
        this.urModelo3d = urModelo3d;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUsoDestinado() {
        return usoDestinado;
    }

    public void setUsoDestinado(String usoDestinado) {
        this.usoDestinado = usoDestinado;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getAmbientes() {
        return ambientes;
    }

    public void setAmbientes(int ambientes) {
        this.ambientes = ambientes;
    }

    public BigDecimal getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(BigDecimal areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }

    public BigDecimal getPrecioPreferencial() {
        return precioPreferencial;
    }

    public void setPrecioPreferencial(BigDecimal precioPreferencial) {
        this.precioPreferencial = precioPreferencial;
    }
}
