package com.grupo3.aplicacion_csi.model.bo;

import java.util.Date;

public class Cargo {

    private long idCargo;

    private long idEmpleado;

    private long idRama;

    private long idProfesion;

    private Date fechaAsignacion;

    private boolean activo;

    public long getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(long idCargo) {
        this.idCargo = idCargo;
    }

    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public long getIdProfesion() {
        return idProfesion;
    }

    public void setIdProfesion(long idProfesion) {
        this.idProfesion = idProfesion;
    }

    public long getIdRama() {
        return idRama;
    }

    public void setIdRama(long idRama) {
        this.idRama = idRama;
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
