package DAO;

import controller.Pais;
import controller.Piloto;
import helper.JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PilotoDAO {

    public void inserirPiloto(Piloto piloto) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into piloto (cod_piloto, cod_pais, cod_equipe, nome, data_nasc) values (?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, piloto.getCod_piloto());
        stmt.setInt(2, piloto.getCod_pais());
        stmt.setInt(3, piloto.getCod_equipe());
        stmt.setString(4, piloto.getNome());
        stmt.setInt(5, piloto.getData_nasc());

        stmt.execute();
        stmt.close();

        System.out.println("Piloto " + piloto.getNome() + " de Numero: " + piloto.getCod_piloto() + " Adicionado");

    }
}