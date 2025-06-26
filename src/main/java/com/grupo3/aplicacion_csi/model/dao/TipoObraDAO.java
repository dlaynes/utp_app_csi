package com.grupo3.aplicacion_csi.model.dao;

import com.grupo3.aplicacion_csi.datasource.ConexionPgSQL;
import com.grupo3.aplicacion_csi.datasource.IConexion;
import com.grupo3.aplicacion_csi.model.bo.TipoObra;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TipoObraDAO {

    IConexion conexion;

    public TipoObraDAO(){
        conexion = new ConexionPgSQL();
    }

    public long create(TipoObra tipoObra){
        String sql = "INSERT INTO tipo_obra (nombre, descripcion, estado) VALUES (?, ?, ?)";

        try(Connection cn = conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, tipoObra.getNombre());
            ps.setString(2, tipoObra.getDescripcion());
            ps.setBoolean(3, tipoObra.isEstado());
            int rowsAffected = ps.executeUpdate();
            if(rowsAffected > 0){
                try (ResultSet generatedKeys = ps.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getLong(1);
                    } else {
                        System.out.println("Hubo un problema al insertar un nuevo tipo de obra.");
                    }
                }
            }
        } catch (SQLException e){
            System.out.println("Error de base de datos: " + e.toString());
        }

        return 0;
    }

    public void update(TipoObra tipoObra){
        String sql = "UPDATE tipo_obra SET nombre = ?, descripcion = ?, estado = ? WHERE id_tipo_obra = ?";
        try(Connection cn = conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setString(1, tipoObra.getNombre());
            ps.setString(2, tipoObra.getDescripcion());
            ps.setBoolean(3, tipoObra.isEstado());
            ps.setLong(4, tipoObra.getIdTipoObra());
            ps.executeUpdate();
        } catch (SQLException e){
            System.out.println("Error de base de datos: " + e.toString());
        }
    }

    public boolean delete(long idTipoObra){
        String sql = "DELETE FROM tipo_obra WHERE id_tipo_obra = ?";
        try(Connection cn = conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setLong(1, idTipoObra);
            int affectedRows = ps.executeUpdate();

            return affectedRows > 0;

        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.toString());
            return false;
        }
    }

    public TipoObra findOne(long idTipoObra){
        String sql = "SELECT * FROM tipo_obra WHERE id_tipo_obra = ?";
        TipoObra tipoObra = new TipoObra();
        try(Connection cn = conexion.getConexion(); PreparedStatement ps = cn.prepareStatement(sql)) {
            ps.setLong(1, idTipoObra);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                tipoObra.setIdTipoObra(rs.getLong("id_tipo_obra"));
                tipoObra.setNombre(rs.getString("nombre"));
                tipoObra.setDescripcion(rs.getString("descripcion"));
                tipoObra.setEstado(rs.getBoolean("estado"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoObra;
    }

    public List<TipoObra> get(){
        List<TipoObra> tipoObras = new ArrayList<>();
        String sql = "SELECT * FROM tipo_obra";
        try(Connection cn = conexion.getConexion(); Statement st = cn.createStatement(); ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()){
                TipoObra tipoObra = new TipoObra();
                tipoObra.setIdTipoObra(rs.getLong("id_tipo_obra"));
                tipoObra.setNombre(rs.getString("nombre"));
                tipoObra.setDescripcion(rs.getString("descripcion"));
                tipoObra.setEstado(rs.getBoolean("estado"));
                tipoObras.add(tipoObra);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tipoObras;
    }

}
