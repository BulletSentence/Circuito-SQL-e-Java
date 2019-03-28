package DAO;

import controller.Piloto;
import controller.Resultado;
import helper.JDBCConection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ResultadoDAO {

    public void inserirResultado(Resultado resultado) throws SQLException {

        Connection conn = null;
        conn = DriverManager.getConnection(JDBCConection.getUrl(),
                JDBCConection.getUsuario(), JDBCConection.getSenha());

        String sql = "insert into resultado (cod_piloto, cod_prova, tempo_prova, colocacao_final, posicao_grid, melhor_volta) values (?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, resultado.getCod_piloto());
        stmt.setInt(2, resultado.getCod_prova());
        stmt.setInt(3, resultado.getTempo_prova());
        stmt.setInt(4, resultado.getColocacao_final());
        stmt.setInt(5, resultado.getPosicao_grid());
        stmt.setInt(6, resultado.getMelhor_volta());

        stmt.execute();
        stmt.close();

        System.out.println("Resultado do piloto numero " + resultado.getCod_piloto() + " Adicionado");

    }

}
