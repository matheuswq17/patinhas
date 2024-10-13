package main.java.com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.ContaInvestimento;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ContaInvestimentoDao {
    private Connection conexao;

    public ContaInvestimentoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }

    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<ContaInvestimento> listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
