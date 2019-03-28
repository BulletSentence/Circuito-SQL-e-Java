package DAO;

import controller.Circuito;
import helper.JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CircuitoDAO {

    public void inserirCircuito(Circuito circuito) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into circuito (cod_circuito, cod_pais, nome, extensão) values (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, circuito.getCod_circuito());
        stmt.setInt(2, circuito.getCod_pais());
        stmt.setString(3, circuito.getNome());
        stmt.setInt(4, circuito.getExtensao());

        stmt.execute();
        stmt.close();

        System.out.println("Circuito " + circuito.getNome() + " adicionado");

    }



}
