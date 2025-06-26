package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class RolUsuario {

    private long idRolUsuario;

    private long idRol;

    private long idUsuario;

    private Date fechaAsignacion;

    private boolean estado;

    public long getIdRolUsuario() {
        return idRolUsuario;
    }

    public void setIdRolUsuario(long idRolUsuario) {
        this.idRolUsuario = idRolUsuario;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idPermiso) {
        this.idUsuario = idPermiso;
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
