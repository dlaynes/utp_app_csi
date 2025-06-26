package com.grupo3.aplicacion_csi.model.bo;

public class TipoObra {

    private long idTipoObra;

    private String nombre;

    private String descripcion;

    private boolean estado;

    public long getIdTipoObra() {
        return idTipoObra;
    }

    public void setIdTipoObra(long idTipoObra) {
        this.idTipoObra = idTipoObra;
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

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
