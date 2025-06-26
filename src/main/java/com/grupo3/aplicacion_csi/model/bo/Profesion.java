package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Profesion {

    private long idProfesion;

    private String nombre;

    private String descripcion;

    private Date fechaAsignacion;

    private boolean estado;

    public long getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(long idProfesion) {
        this.idProfesion = idProfesion;
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

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(Date fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean activo) {
        this.estado = activo;
    }
}
