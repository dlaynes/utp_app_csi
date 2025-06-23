package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class RolPermiso {

    private long idRolPermiso;

    private long idRol;

    private long idPermiso;

    private Date fechaAsignacion;

    private boolean activo;

    public long getIdRolPermiso() {
        return idRolPermiso;
    }

    public void setIdRolPermiso(long idRolPermiso) {
        this.idRolPermiso = idRolPermiso;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public long getIdPermiso() {
        return idPermiso;
    }

    public void setIdPermiso(long idPermiso) {
        this.idPermiso = idPermiso;
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
