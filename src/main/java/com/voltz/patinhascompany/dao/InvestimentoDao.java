package com.voltz.patinhascompany.dao;

import main.java.com.voltz.patinhascompany.factory.ConnectionFactory;
import main.java.com.voltz.patinhascompany.models.Investimento;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class InvestimentoDao {
    private Connection conexao;

    public InvestimentoDao() throws SQLException {
        conexao = ConnectionFactory.getConnection();
    }
    public void fecharConexao() throws SQLException{
        conexao.close();
    }

    public void cadastrar(){}
    public List<Investimento>listar(){return null;}
    public void atualizar(){}
    public void remover(){}

}
