package main.java.com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.Empresa;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class EmpresaDao {
    private Connection conexao;

    public EmpresaDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<Empresa> listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
