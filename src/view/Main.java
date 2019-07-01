package view;

import DAO.*;
import controller.*;
import helper.JDBCConection;

import java.sql.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) throws SQLException {

        // Instancias DAO
        CircuitoDAO circuitoDAO = new CircuitoDAO();
        EquipeDAO equipeDAO = new EquipeDAO();
        PaisDAO paisDAO = new PaisDAO();
        PilotoDAO pilotoDAO = new PilotoDAO();
        ProvaDAO provaDAO = new ProvaDAO();
        ResultadoDAO resultadoDAO = new ResultadoDAO();

        try {
            // Dados a serem inseridos
//            Circuito circuito = new Circuito(2, 1, "Circuito no gelo", 410000);
//            circuitoDAO.inserirCircuito(circuito);
//
//             Pais pais = new Pais(2, "Maranhão", 15);
//             paisDAO.inserirPais(pais);
//
//            Equipe equipe = new Equipe(1, 2, "Yamaha");
//            equipeDAO.inserirEquipe(equipe);
//
//            Piloto piloto = new Piloto(2,1,2, "Leonardo Almeida", 1999);
//            pilotoDAO.inserirPiloto(piloto);

                    Calendar cal = Calendar.getInstance();
            cal.set(2018, Calendar.JANUARY, 1);

            Prova prova = new Prova(5, 4, cal);
            provaDAO.inserirProva(prova);
//
//           Resultado resultado = new Resultado(1,2,90,9,2,1);
//            resultadoDAO.inserirResultado(resultado);

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Erro ao inserir, ID repetido");
        }

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {

            conn = DriverManager.getConnection(JDBCConection.getUrl(), JDBCConection.getUsuario(), JDBCConection.getSenha());

            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT version()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {

                if (stmt != null) {
                    stmt.close();
                }
                if (rs != null) {
                    rs.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}


