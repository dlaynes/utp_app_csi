package com.grupo3.aplicacion_csi.model.bo;

public class Material {

    private long idMaterial;

    private long idTipoMaterial;

    private String nombre;

    private double precioUnitario;

    private int stockActual;

    private int masaEspecifica;

    private double longitud;

    private double temperaturaTermodinamica;

    private String descripcion;

    private boolean activo;

    public long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(long idMaterial) {
        this.idMaterial = idMaterial;
    }

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

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getMasaEspecifica() {
        return masaEspecifica;
    }

    public void setMasaEspecifica(int masaEspecifica) {
        this.masaEspecifica = masaEspecifica;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getTemperaturaTermodinamica() {
        return temperaturaTermodinamica;
    }

    public void setTemperaturaTermodinamica(double temperaturaTermodinamica) {
        this.temperaturaTermodinamica = temperaturaTermodinamica;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
