package com.grupo3.aplicacion_csi.model.bo;

public class TipoConstruccion {

    private long idTipoConstruccion;

    private String nombre;

    private String descripcion;

    private boolean estado;

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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
