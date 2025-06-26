package com.grupo3.aplicacion_csi.model.bo;

public class TipoMaterial {

    private long idTipoMaterial;

    private String nombre;

    private String descripcion;

    private String clasificacion;

    private boolean estado;

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
