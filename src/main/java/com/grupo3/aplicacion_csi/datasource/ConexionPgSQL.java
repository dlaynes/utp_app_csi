package com.grupo3.aplicacion_csi.datasource;

import java.sql.*;
import java.util.Properties;

public class ConexionPgSQL implements IConexion {
    private static final String URL = "jdbc:postgresql://localhost:5432/utp_adsi_csi";
    private static final String USUARIO = "donato";
    private static final String PASSWORD = "12tres";

    private static Connection conn = null;

    public Connection getConexion() {
        try {
            if(ConexionPgSQL.conn == null || ConexionPgSQL.conn.isClosed()){
                Properties props = new Properties();
                props.setProperty("user", USUARIO);
                props.setProperty("password", PASSWORD);
                props.setProperty("ssl", "false");

                ConexionPgSQL.conn = DriverManager.getConnection(URL, props);
            }
        } catch (SQLException e) {
            System.out.println("Error: No se pudo conectar a la base de datos.");
            e.printStackTrace();
        }
        return ConexionPgSQL.conn;
    }

    public void cerrar(){
        try {
            if(ConexionPgSQL.conn != null && !ConexionPgSQL.conn.isClosed()){
                ConexionPgSQL.conn.close();
            }
        } catch (SQLException e) {
            System.out.println("Error: No se pudo cerrar la conexión a la base de datos.");
            e.printStackTrace();
        }
    }

}
