package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Rama {

    private long idRama;

    private long idProfesion;

    private String nombre;

    private String descripcion;

    private Date fechaAsignacion;

    private boolean activo;

    public long getIdRama() {
        return idRama;
    }

    public void setIdRama(long idRama) {
        this.idRama = idRama;
    }

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

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
