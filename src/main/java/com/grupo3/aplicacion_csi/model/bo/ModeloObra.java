package com.grupo3.aplicacion_csi.model.bo;

public class ModeloObra {

    private long idModeloObra;

    private long idTipoObra;

    private String urlModelo3d;

    private String nombre;

    private String descripcion;

    private String usoDestinado;

    private int pisos;

    private int ambientes;

    private double areaTotal;

    private int capacidadPersonas;

    private double precioPreferencial;

    private double activo;

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

    public String getUrlModelo3d() {
        return urlModelo3d;
    }

    public void setUrlModelo3d(String urlModelo3d) {
        this.urlModelo3d = urlModelo3d;
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

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public int getCapacidadPersonas() {
        return capacidadPersonas;
    }

    public void setCapacidadPersonas(int capacidadPersonas) {
        this.capacidadPersonas = capacidadPersonas;
    }

    public double getActivo() {
        return activo;
    }

    public void setActivo(double activo) {
        this.activo = activo;
    }

    public double getPrecioPreferencial() {
        return precioPreferencial;
    }

    public void setPrecioPreferencial(double precioPreferencial) {
        this.precioPreferencial = precioPreferencial;
    }
}
