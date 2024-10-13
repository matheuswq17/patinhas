package com.voltz.patinhascompany.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl";

    //Como é um projeto apenas entregável para a FIAP, estou disponibilizando meu acesso para não ter que mudar
    //na hora de avaliar, porém se fosse upado no gitHub, esse usuário e senha deveria ser oculto.
    private static final String USUARIO = "RM552271";
    private static final String SENHA = "180105";
    public static Connection getConnection() throws SQLException {

        Connection connection = DriverManager.getConnection(URL, USUARIO, SENHA);

        return connection;

    }
}
