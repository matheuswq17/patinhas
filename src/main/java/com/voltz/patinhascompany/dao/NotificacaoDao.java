package main.java.com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.Notificacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class NotificacaoDao {
    private Connection conexao;

    public NotificacaoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<Notificacao>listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
