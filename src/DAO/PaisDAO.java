package DAO;

import controller.Pais;
import helper.JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PaisDAO {

    public void inserirPais(Pais pais) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into pais (cod_pais, nome, populacao) values (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, pais.getCod_pais());
        stmt.setString(2, pais.getNome());
        stmt.setInt(3, pais.getPopulacao());

        stmt.execute();
        stmt.close();

        System.out.println("Pais de nome: " + pais.getNome() + " adicionado!");


    }

}
