package com.grupo3.aplicacion_csi.model.bo;

public class FormaTerreno {

    private long idFormaTerreno;

    private String nombre;

    private String descripcion;

    private boolean estado;

    public long getIdFormaTerreno() {
        return idFormaTerreno;
    }

    public void setIdFormaTerreno(long idFormaTerreno) {
        this.idFormaTerreno = idFormaTerreno;
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
