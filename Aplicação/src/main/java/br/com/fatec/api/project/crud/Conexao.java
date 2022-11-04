package br.com.fatec.api.project.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    /**
     *
     * @author Igor
     */
    public class Conexao {

        public Connection getConnection() throws SQLException{
            Connection conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/iacit", "postgres", "postgres");
            return conexao;
        }
    }

