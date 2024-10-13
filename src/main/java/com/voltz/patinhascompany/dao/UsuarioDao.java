package main.java.com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.Usuario;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UsuarioDao {
    private Connection conexao;

    public UsuarioDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }
    public void fecharConexao() throws SQLException{
        conexao.close();
    }
    public void cadastrar(){}
    public List<Usuario>listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
