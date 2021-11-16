/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsf.Services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author
 */
public class PostgreSQLManager {

    private final String uri;
    private final String user;
    private final String password;

    private static final Logger LOG = Logger.getLogger(PostgreSQLManager.class.getName());

    public PostgreSQLManager() {
        uri = "jdbc:postgresql://localhost:5432/estagio";
        user = "postgres";
        password = "joao";
    }

    private Connection getConnection() {
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(uri, user, password);
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            LOG.log(Level.SEVERE, ex.getMessage());
            return null;
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            Connection con = getConnection();
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(query);
            con.close();
            return rs;
        } catch (SQLException ex) {
            return null;
        }
    }
}
