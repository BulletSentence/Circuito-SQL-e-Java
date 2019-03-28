package DAO;

import controller.Piloto;
import controller.Prova;
import helper.JDBCConection;

import java.sql.*;
import java.util.Calendar;

public class ProvaDAO {

    public void inserirProva(Prova prova) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into prova (cod_prova, cod_circuito, data) values (?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        java.sql.Date dataParaGravar = new java.sql.Date(
                Calendar.getInstance().getTimeInMillis());

        stmt.setInt(1, prova.getCod_prova());
        stmt.setInt(2, prova.getCod_circuito());
        stmt.setDate(3, new java.sql.Date(prova.getData().getTimeInMillis()));

        stmt.execute();
        stmt.close();

    }

}
