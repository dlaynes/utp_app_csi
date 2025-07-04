package com.grupo3.aplicacion_csi.model.bo;

public class TipoFinanciamiento {

    private long idTipoFinanciamiento;

    private String nombre;

    private String descripcion;

    private boolean estado;

    public long getIdTipoFinanciamiento() {
        return idTipoFinanciamiento;
    }

    public void setIdTipoFinanciamiento(long idTipoFinanciamiento) {
        this.idTipoFinanciamiento = idTipoFinanciamiento;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
