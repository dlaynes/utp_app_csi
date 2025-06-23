package com.grupo3.aplicacion_csi.model.bo;

public class TipoConstruccion {

    private long idTipoConstruccion;

    private String nombre;

    private String descripcion;

    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getIdTipoConstruccion() {
        return idTipoConstruccion;
    }

    public void setIdTipoConstruccion(long idTipoConstruccion) {
        this.idTipoConstruccion = idTipoConstruccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
