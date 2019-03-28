package DAO;

import controller.Circuito;
import controller.Equipe;
import helper.JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EquipeDAO {

    public void inserirEquipe(Equipe equipe) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into equipe (cod_equipe, cod_pais, nome ) values (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, equipe.getCod_equipe());
        stmt.setInt(2, equipe.getCod_pais());
        stmt.setString(3, equipe.getNome());

        stmt.execute();
        stmt.close();

        System.out.println("Pais de nome: " + equipe.getNome() + " adicionado");

    }
}